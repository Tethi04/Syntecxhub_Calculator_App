package com.syntecxhub.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvDisplay: TextView
    private lateinit var tvExpression: TextView
    private val calculator = CalculatorEngine()
    private var currentInput = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplay = findViewById(R.id.tvDisplay)
        tvExpression = findViewById(R.id.tvExpression)

        setupButtonListeners()
    }

    private fun setupButtonListeners() {
        val numberButtons = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btnDot
        )

        for (id in numberButtons) {
            findViewById<Button>(id).setOnClickListener { button ->
                currentInput.append((button as Button).text)
                tvDisplay.text = currentInput.toString()
            }
        }

        val operatorButtons = mapOf(
            R.id.btnPlus to " + ",
            R.id.btnMinus to " - ",
            R.id.btnMultiply to " × ",
            R.id.btnDivide to " ÷ "
        )

        for ((id, op) in operatorButtons) {
            findViewById<Button>(id).setOnClickListener {
                if (currentInput.isNotEmpty() && !currentInput.endsWith(" ")) {
                    currentInput.append(op)
                    tvDisplay.text = currentInput.toString()
                }
            }
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            currentInput.clear()
            tvDisplay.text = "0"
            tvExpression.text = ""
        }

        findViewById<Button>(R.id.btnDelete).setOnClickListener {
            if (currentInput.isNotEmpty()) {
                currentInput.deleteCharAt(currentInput.length - 1)
                tvDisplay.text = if (currentInput.isEmpty()) "0" else currentInput.toString()
            }
        }

        findViewById<Button>(R.id.btnEquals).setOnClickListener {
            if (currentInput.isNotEmpty()) {
                val expression = currentInput.toString()
                val result = calculator.evaluate(expression)
                
                tvExpression.text = expression
                tvDisplay.text = result
                
                currentInput.clear()
                if (result != "Error" && !result.contains("Cannot")) {
                    currentInput.append(result)
                }
            }
        }
    }
}

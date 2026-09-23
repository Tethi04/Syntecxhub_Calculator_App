package com.example.pastelglasscalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvDisplay: TextView
    private lateinit var tvExpression: TextView

    private var currentInput = "0"
    private var expressionText = ""
    private var isNewInput = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplay = findViewById(R.id.tvDisplay)
        tvExpression = findViewById(R.id.tvExpression)

        setupNumberButtons()
        setupOperatorButtons()
    }

    private fun setupNumberButtons() {
        val numberButtons = mapOf(
            R.id.btn0 to "0", R.id.btn1 to "1", R.id.btn2 to "2",
            R.id.btn3 to "3", R.id.btn4 to "4", R.id.btn5 to "5",
            R.id.btn6 to "6", R.id.btn7 to "7", R.id.btn8 to "8",
            R.id.btn9 to "9", R.id.btnDot to "."
        )

        for ((id, value) in numberButtons) {
            findViewById<Button>(id).setOnClickListener {
                if (isNewInput) {
                    currentInput = if (value == ".") "0." else value
                    isNewInput = false
                } else {
                    if (value == "." && currentInput.contains(".")) return@setOnClickListener
                    currentInput += value
                }
                tvDisplay.text = currentInput
            }
        }
    }

    private fun setupOperatorButtons() {
        findViewById<Button>(R.id.btnClear).setOnClickListener {
            currentInput = "0"
            expressionText = ""
            isNewInput = true
            tvDisplay.text = "0"
            tvExpression.text = ""
        }

        findViewById<Button>(R.id.btnSign).setOnClickListener {
            if (currentInput != "0") {
                currentInput = if (currentInput.startsWith("-")) currentInput.substring(1) else "-$currentInput"
                tvDisplay.text = currentInput
            }
        }

        val operators = mapOf(
            R.id.btnPlus to "+", R.id.btnMinus to "−",
            R.id.btnMultiply to "×", R.id.btnDivide to "÷"
        )

        for ((id, op) in operators) {
            findViewById<Button>(id).setOnClickListener {
                expressionText = "$currentInput $op"
                tvExpression.text = expressionText
                isNewInput = true
            }
        }

        findViewById<Button>(R.id.btnEnter).setOnClickListener {
            try {
                val num1 = expressionText.split(" ")[0].toDoubleOrNull() ?: 0.0
                val op = expressionText.split(" ").getOrNull(1) ?: ""
                val num2 = currentInput.toDoubleOrNull() ?: 0.0

                val result = when (op) {
                    "+" -> num1 + num2
                    "−" -> num1 - num2
                    "×" -> num1 * num2
                    "÷" -> if (num2 != 0.0) num1 / num2 else Double.NaN
                    else -> num2
                }

                tvExpression.text = "$expressionText $currentInput ="
                currentInput = if (result % 1.0 == 0.0) result.toLong().toString() else result.toString()
                tvDisplay.text = currentInput
                isNewInput = true
            } catch (e: Exception) {
                tvDisplay.text = "Error"
                isNewInput = true
            }
        }
    }
}

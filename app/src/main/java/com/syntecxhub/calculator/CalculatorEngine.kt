package com.syntecxhub.calculator

class CalculatorEngine {

    fun evaluate(expression: String): String {
        if (expression.isBlank()) return "0"

        return try {
            val tokens = expression.trim().split(" ")
            if (tokens.size < 3) return expression

            val num1 = tokens[0].toDoubleOrNull() ?: return "Error"
            val operator = tokens[1]
            val num2 = tokens[2].toDoubleOrNull() ?: return "Error"

            when (operator) {
                "+" -> formatResult(num1 + num2)
                "-" -> formatResult(num1 - num2)
                "×" -> formatResult(num1 * num2)
                "÷" -> {
                    if (num2 == 0.0) {
                        "Cannot divide by 0"
                    } else {
                        formatResult(num1 / num2)
                    }
                }
                else -> "Error"
            }
        } catch (e: Exception) {
            "Error"
        }
    }

    private fun formatResult(value: Double): String {
        return if (value % 1.0 == 0.0) {
            value.toLong().toString()
        } else {
            String.format("%.4f", value).trimEnd('0').trimEnd('.')
        }
    }
}

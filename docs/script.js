        let currentInput = '2021';
        let expressionText = '(62 × 25) + 471';
        let isNewInput = true;

        const display = document.getElementById('display');
        const expression = document.getElementById('expression');

        function appendNumber(num) {
            if (isNewInput) {
                currentInput = num;
                isNewInput = false;
            } else {
                if (num === '.' && currentInput.includes('.')) return;
                currentInput += num;
            }
            updateDisplay();
        }

        function appendOperator(op) {
            const displayOp = op === '*' ? '×' : op === '/' ? '÷' : op;
            expressionText = `${currentInput} ${displayOp}`;
            expression.innerText = expressionText;
            isNewInput = true;
        }

        function toggleSign() {
            if (currentInput !== '0') {
                currentInput = currentInput.startsWith('-') ? currentInput.slice(1) : '-' + currentInput;
                updateDisplay();
            }
        }

        function calculate() {
            try {
                let sanitizedExp = expressionText
                    .replace(/×/g, '*')
                    .replace(/÷/g, '/')
                    .replace(/−/g, '-');
                
                if (!isNewInput) {
                    sanitizedExp += ' ' + currentInput;
                }

                let result = eval(sanitizedExp);
                expression.innerText = sanitizedExp + ' =';
                currentInput = String(Number.isInteger(result) ? result : parseFloat(result.toFixed(4)));
                updateDisplay();
                isNewInput = true;
            } catch (e) {
                currentInput = 'Error';
                updateDisplay();
                isNewInput = true;
            }
        }

        function clearDisplay() {
            currentInput = '0';
            expressionText = '';
            expression.innerText = '';
            isNewInput = true;
            updateDisplay();
        }

        function updateDisplay() {
            display.innerText = currentInput;
        }

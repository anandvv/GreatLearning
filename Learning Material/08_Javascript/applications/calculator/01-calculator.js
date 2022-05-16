(function(){
    const op1 = document.getElementById('operand-1');
    const op2 = document.getElementById('operand-2');
    const operator = document.getElementById('operator');
    const goBtn = document.getElementById('btn-go');
    
    const resultSpan = document.getElementById('result-1');

    goBtn.addEventListener('click', function(){
        
        const operand1 = parseFloat(op1.value);
        const operand2 = parseFloat(op2.value);

        let result;

        switch (operator.value) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
                                
            default:
                alert('Invalid choice of operator');
        }

        resultSpan.innerHTML = result;
    
    });

})();
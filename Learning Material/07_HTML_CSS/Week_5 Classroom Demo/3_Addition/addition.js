function take_input(){
    // get values from html tags using id 
    var ops1 = document.getElementById('op1').value;
    var ops2 = document.getElementById('op2').value;
    // get value from list 
    var operators = document.getElementById('operator').value;

    var res;
    // convert values to integer
    ops1 = Number.parseInt(ops1);
    ops2 = Number.parseInt(ops2);
    switch (operators){
        case '+' :
            res = ops1 + ops2;
            break;
        case '-' :
            res = ops1 - ops2;
            break;
        case '*' :
            res = ops1 * ops2;
            break;
        case '/' :
            res = ops1 / ops2;
            break;
    }
    // print the result in <p> tag with id result1
    document.getElementById("result1").innerHTML = res;
}

function eval_input(){
    try {
        // expression is evaluated in eval(document.getElementById('exp').value) and 
        //  the result is stored in expression variable
        var expression = eval(document.getElementById('exp').value);

        // checking if the result is valid or not
        if(expression == "Infinity" || expression == "undefined"){
            throw new Error('Incorrect input!')
        }
        else{
            // print the result in <p> tag with id result2
            document.getElementById('result2').innerHTML = expression;
        }
      }
      catch (e) {
        //   print the error message 
        alert(e.message) 
      }
}
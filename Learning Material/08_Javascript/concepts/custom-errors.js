function sum(x, y){
    if(typeof x === 'number' && typeof y === 'number'){
        return x+y;
    }

    throw new Error("Custom Error: only numbers are allowed as argument");

}

//challenge question
function divide(a, b){
    if(typeof a === 'number' && typeof b === 'number' && b > 0){
        print("Answer after dividing a by b = ", a/b);
        return;
    }

    throw new Error("Custom Error: only numbers are allowed & the divisor must be greater than 0");
}

function print(strMessage, answer){
    console.log(strMessage + " " + answer);
}

try {
    // console.log(sum(12,'hello'));    
    divide(12, 6);
    //divide(12, 0);
    divide('hello', 5);
    //divide(10, -5);

} catch (error) {
    console.log(error.message);
}

function foo(x,y,z){
    console.log(x,y,z);
    console.log('foo was called');

    console.log(arguments);
    console.log(arguments.length);
    console.log(arguments[0]);
    console.log(arguments[1]);
    console.log(arguments[2]);
    console.log(arguments[3]);
}

// can call function using more arguments - interpreter won't throw error. HMMM WORKS
foo('hello', 'world', 'Good', 'morning'); 



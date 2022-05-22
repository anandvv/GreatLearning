try {
    foo();   
    console.log('after call to foo (within try block)'); 
} catch (error) {
    console.log('Error: ' + error.message);
} finally {
    console.log('inside finally block');
}


console.log('after foo called');

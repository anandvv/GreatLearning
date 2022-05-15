
console.log(sum(20,30));

//console.log(sum2(20,30)); --> this will throw an error

//function declaration syntax - CAN CALL THIS ANYWHERE IN THE FILE (Scan for functions happens before calls)

function sum(x,y){
    var result = x + y;
    return result;
}

var result = sum(12, 13);
console.log(result);

//function expression syntax -- CAN CALL THIS ONLY AFTER function is created in file

var sum2 = function(x,y){
    var result = x + y;
    return result;
}


console.log(sum2(13, 14));

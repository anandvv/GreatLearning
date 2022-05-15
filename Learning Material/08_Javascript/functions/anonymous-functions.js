const sum = function(x,y, logResult){
    var result = x+y;
    logResult(result);
};

function logResult(result){
    console.log(result);
}

sum(10,20, logResult);


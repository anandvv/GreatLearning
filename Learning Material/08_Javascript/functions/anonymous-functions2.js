const sum = function(x,y, cb){
    var result = x+y;
    cb(result);
};

sum(10, 20, function logResult(result){
    console.log(result);
});


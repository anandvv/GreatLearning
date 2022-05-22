var obj=[
    {name:"One",val:55},
    {name:"Two",val:48},
    {name:"Three",val:2},
    {name:"Four",val:105},
    {name:"Five",val:65}    
]

obj.forEach(function(item){
    if(item.val%2 === 0 ){
        console.log(item);
    }
});

var resultArray = obj.filter(function(item){
    return (item.val > 50);
});

console.log(resultArray);

var mapArray = obj.map(function(item){
    return item.val * item.val;
});

console.log(mapArray);
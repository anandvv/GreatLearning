//forEach

var days = [
    {day: 'Sunday', hours: 2}, 
    {day: 'Monday', hours: 8},
    {day: 'Tuesday', hours: 7},
    {day: 'Wednesday', hours: 10}
];

days.forEach(function(item){
    console.log(item);
});

//filter returns an array
var resultDays = days.filter(function(item){
    return item.hours >=8 ? true : false;
    //OR SIMPLY : return item.hours >= 8;
});

console.log(resultDays);

var numbers = [1,2,3,4];

var squares = numbers.map(function(item){
    return item*item;
});

console.log(squares);

//TODO: some, every, reduce


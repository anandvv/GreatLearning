//current date and time
var today = new Date();

console.log(today);

var millenniumStart = new Date(2000, 0, 1);
console.log(millenniumStart);

//add to date 
var tomorrow = today.setDate(today.getDate() + 1);
console.log(tomorrow);

var July31 = new Date(2020, 6, 31);
console.log(July31);

July31.setDate(July31.getDate() + 1);
console.log(July31);

//getters
console.log(July31.getMonth());
console.log(July31.getDay());

console.log((new Date()).getDay);


//setters

var today = new Date();
console.log(today);

today.setDate(9);
console.log(today);

//year
today.setFullYear(2018);
console.log(today);

console.log(today.toTimeString());
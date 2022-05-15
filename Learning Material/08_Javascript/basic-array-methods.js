var days = [
    'Monday',
    'Tuesday',
    'Wednesday',
    'Thursday',
    'Friday'
];

days.sort();

console.log(days);

days.reverse();

console.log(days);

console.log(days.indexOf('Monday'));
console.log(days.indexOf('Saturday'));
console.log(days.indexOf('BooDay'));

var numbers = [20, 60, 40, 65, 80, 8, 22, 30];

numbers.sort();

console.log(numbers);

//to sort in number ordering

numbers.sort(function(x,y){
    return x-y;
});

console.log(numbers);

numbers.sort(function(x,y){
    return y-x;
});

console.log(numbers);

var numberOfHours = [
    {hours: 20, name: 'Project 1'},
    {hours: 60, name: 'Project 2'},
    {hours: 40, name: 'Project 3'},
    {hours: 65, name: 'Project 4'},
    {hours: 80, name: 'Project 5'}
];

numberOfHours.sort(function(x,y){
    return x.hours - y.hours;
});

console.log(numberOfHours);

//add to end
days.push('Saturday');

console.log(days);

//add to end
days.push('Sunday');

console.log(days);

//remove from end
console.log(days.pop());

console.log(days);

//add to beginning
days.unshift('Holiday');
console.log(days);

//remove from beginning
days.shift();
console.log(days);

//remove multiple items: starting index and number of items
days.splice(2, 2);
console.log(days);

//can also add using splice
days.splice(2, 0, 'Thursday', 'Monday');
console.log(days);

//SLICE

var slicedDays= days.slice(2,4);
console.log(slicedDays);

slicedDays = days.slice(2);
console.log(slicedDays);



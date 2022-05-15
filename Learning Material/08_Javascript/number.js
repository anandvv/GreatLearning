//base 10
console.log(Number.parseInt("3.56", 10));

//hexadecimal
console.log(Number.parseInt("a", 16));

//parsing floats
console.log(Number.parseFloat("3.56", 10));

//useful for currency values
var wrappedNumber = new Number(3.5678);
console.log(wrappedNumber.toFixed(2));
console.log(3.5678.toFixed(3));

var x = 1/'hello'
console.log(1/'hello');
console.log(x);

//cannot compare NaN

console.log(1/'hello' === NaN);
console.log(Number.isNaN(1/'hello'));


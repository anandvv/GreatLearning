var quote = 'With great power comes great responsibility';

//specific starting index and ending index (excludes ending index)
var subString = quote.substring(10,20);

console.log(subString);

//starting index to end
var pieceOfTheQuote = quote.substring(20);
console.log(pieceOfTheQuote);

//replace something inside a string

var quoteToReplace = quote.replace('responsibility', 'electricity bill');
console.log(quoteToReplace);

//split strings

var fruits = 'apples,oranges,bananas';
console.log(fruits.split(','));

//finding the first occurrance of something in strings
var firstIndex = quote.indexOf('great');
console.log(firstIndex);

//finding the last occurring index
var lastIndex = quote.lastIndexOf('great');
console.log(lastIndex);

//something not there will return -1
var anotherIndex = quote.lastIndexOf('greatest');
console.log(anotherIndex);


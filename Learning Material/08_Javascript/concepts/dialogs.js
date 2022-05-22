//alert() is a blocking method because action is required
alert('this is your information');
console.log('after alert');

//confirm dialog
var result = confirm('Do you really want to exit the website?'); 
console.log(result);

//prompt
var result = prompt('Enter your favorite city', 'Bangalore');
console.log(result);

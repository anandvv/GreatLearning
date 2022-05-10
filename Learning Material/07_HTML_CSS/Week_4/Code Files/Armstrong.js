// program to check an Armstrong number of three digits

let sum = 0;
const number = prompt('Enter a positive integer: ');

// create a temporary variable
let temp = number;
let num_length = number.length;
while (temp > 0) {
    // finding the one's digit
    let remainder = temp % 10;

    // option 1
    sum += Math.pow(remainder, num_length);

    // option 2
    // sum += remainder * remainder * remainder;

    // removing last digit from the number
    temp = parseInt(temp / 10); // converting float into integer
}
// check the condition
if (sum == number) {

    // Option 1
    alert(`${number} is an Armstrong number`);

    // Option 2
    // console.log(`${number} is an Armstrong number`);
}
else {

    // Option 1
    alert(`${number} is not an Armstrong number.`);

    // Option 2
    // console.log(`${number} is not an Armstrong number.`);
}
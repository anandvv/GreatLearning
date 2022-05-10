// Diamond Pattern

var row, i, j, blank_space = 1;

// "Enter the first half number of rows: "
row = 5;

// initial number of blanks before first * in every row 
blank_space = row - 1;

// save every row output in output_pattern
var output_pattern=""

// print first half of the diamond pattern
for (j = 1; j<= row; j++)
{
    // allocate required blank spaces before first star
    for (i = 1; i<= blank_space; i++)
    {
        output_pattern+=" "
    }

    // keep reducing the blank space after every row
    blank_space--;

    // print 2*j-1 stars in every row after blank space
    for (i = 1; i <= 2 * j - 1; i++)
    {
        output_pattern+='*'
    }
    // used to go to next line
    output_pattern+='\n'
}

// reset blank space to 1 
blank_space = 1;

// print second half of the diamond pattern
for (j = 1; j<= row - 1; j++)
{
    // allocate required blank spaces before first star
    for (i = 1; i<= blank_space; i++)
    {
        output_pattern+=' '
    }

    // keep increasing the blank space after every row
    blank_space++;

    // print 2*(row-j)-1 stars in every row after blank space
    for (i = 1; i<= 2 * (row - j) - 1; i++)
    {
        output_pattern+='*'
    }
    // used to go to next line
    output_pattern+='\n'
}
// print the final output pattern
console.log(output_pattern);
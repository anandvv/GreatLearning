var rows = 10;     

var output_pattern=""

// print first half of the pattern
for (var i= 0; i<= rows-1 ; i++)
{
    // provide required space in each row before first *
    for (var j=0; j <i; j++)
    {
        output_pattern+=" "
    }

    // print required stars in each row
    for (var k=i; k<=rows-1; k++) 
    { 
        output_pattern+="* "
    } 
    // used to go to next line
    output_pattern+='\n'
} 
for (var i= rows-1; i>= 0; i--)
{
    // provide required space in each row before first *
    for (var j=0; j< i ;j++)
    {
        output_pattern+=' '
    }

    // print required stars in each row
    for (var k=i; k<=rows-1; k++)
    {
        output_pattern+='* '
    }

    // used to go to next line
    output_pattern+='\n'
}
// print the final output pattern
console.log(output_pattern)
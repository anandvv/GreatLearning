var printValues = function printValues(strParam1, numParam2){
    console.log(strParam1);
    console.log(numParam2);
}

function areaOfSquare(edge){
    printValues("Area of square", edge*edge);
}

function areaOfRectangle(length, width){
    printValues("Area of rectangle", length*width);
    
}

function areaOfCircle(radius){
    printValues("Area of circle", Math.PI*radius*radius);
}

Object.setPrototypeOf(areaOfSquare, printValues);
Object.setPrototypeOf(areaOfRectangle, printValues);
Object.setPrototypeOf(areaOfCircle, printValues);

areaOfSquare(5);
areaOfRectangle(2,5);
areaOfCircle(4);



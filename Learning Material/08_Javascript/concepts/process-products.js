const strProducts = `
[
    {
        "name": "Hammer",
        "description": "A claw hammer",
        "price": 120,
        "rating": {
            "min": 2,
            "max": 5
        }
    },
    {
        "name": "Video game controller",
        "description": "A video game controller",
        "price": 15000
    }
]
`;

var arrProducts = JSON.parse(strProducts);
console.log(arrProducts);

var newProduct = {
    "name": "Biscuits",
    "description": "Whole Wheat Biscuits",
    "price": 150
};

arrProducts.push(newProduct);

var strRetval = JSON.stringify(arrProducts);

console.log(strRetval);
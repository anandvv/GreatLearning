const jsonObj = `
{
    "name": "Json",
    "type": "Exchange Format",
    "similarTypes": ["XML", "CSV", "YML"],
    "rating": 10
}
`;

var myJsonObject = JSON.parse(jsonObj);

console.log(myJsonObject);

// john = {
//     name: 'John',
//     age: 32,
//     celebrateBirthday: function(){
//         this.age++;
//     }
// }

// mary = {
//     name: 'Mary',
//     age: 43,
//     celebrateBirthday: function(){
//         this.age++;
//     }
// }

function Person(name, age){
    this.name = name;
    this.age = age;
}

Person.prototype.celebrateBirthday = function (){
    this.age++;
}

var john = new Person('John', 32);
john.celebrateBirthday();
console.log(john);

var mary = new Person('Mary', 43);
mary.celebrateBirthday();
console.log(mary);
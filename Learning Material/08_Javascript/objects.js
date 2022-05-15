var sholay = {
    "name": 'Sholay',
    cast: ['Amitabh', 'Dharmendra', 'Hema', 'Amjad', 'Jaya'],
    "box Office Stats":{
        countries: 10,
        collection: 12300000
    },
    addToCollection: function(amount){
        this["box Office Stats"].collection += amount;
    }
};

console.log(sholay.name);
console.log(sholay.cast[1]);
console.log(sholay["box Office Stats"]);
console.log(sholay["box Office Stats"].collection);
console.log(sholay["box Office Stats"]["collection"]);
console.log(sholay);

sholay.addToCollection(350000);

//can dynamically add properties
sholay.villain = 'Gabbar Singh';

sholay.addToCast = function(newCastMember){
    this.cast[this.cast.length] = newCastMember;
}

sholay.addToCast('Samba');

console.log(sholay);

delete sholay["box Office Stats"];

console.log(sholay);




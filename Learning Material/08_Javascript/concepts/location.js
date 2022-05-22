console.log(location);
console.log(location.protocol);
console.log(location.path);

//navigating to a different url
location = "https://www.google.com"
location.href = "https://www.google.com";
location.assign("http://www.google.com");

//replaces the location
location.replace("https://medium.com");
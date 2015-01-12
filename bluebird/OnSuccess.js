var Promise = require('bluebird');

var myFuture = Promise.resolve(42);
myFuture.then(function(value){
    console.log(value);
});

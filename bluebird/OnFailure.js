var Promise = require('bluebird');

var myFuture = Promise.reject(new Error("oops"));
myFuture.catch(function(err) {
    console.log("Oh no: " + err.message);
});

var Promise = require('bluebird');

var myFuture = Promise.reject(new Error("oops"));
myFuture.finally(function(err) {
    console.log("This will be executed even if the Future fails.");
});

var Promise = require('bluebird');

var myFuture = Promise.resolve(42);

myFuture.then(function(res) {
    return Promise.resolve(res * 2);
}).then(function(res2) {
    return Promise.resolve(res2 * 2);
}).then(function(res3) {
    console.log("Final result: " + res3);
});

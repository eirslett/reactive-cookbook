var Promise = require('bluebird');

var myFuture = Promise.resolve(42);
myFuture.then(function(res) {
    return res * 2;
});

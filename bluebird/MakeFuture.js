var Promise = require('bluebird');

var mySuccessFuture = Promise.resolve(42);
var myFailureFuture = Promise.reject(42);

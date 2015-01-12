var Promise = require('bluebird');

var myFuture = new Promise(function(done){
    // do some time-consuming stuff, e.g. a network call, or just sleep
    setTimeout(function(){
        // resolves the future
        done(42);
    }, 1);
});

var curl;
(function() {
    curl.config({
        main: 'hello',
        packages: {
            hello : {location: 'hello'},
            curl: {location: 'lib/curl/src/curl'},
            rest: {location: 'lib/rest', main: 'rest'},
            when: {location: 'lib/when', main: 'when'}
        }
    })
})
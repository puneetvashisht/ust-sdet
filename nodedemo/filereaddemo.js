const fs = require('fs');

fs.readFile('./first.js', (err, data)=>{
    console.log('Contents: ' + data);
})
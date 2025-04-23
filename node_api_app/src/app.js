const express = require('express');
const os = require('node:os');

const app = express();

app.get('/', (req, res) => {
    console.log("GET / called.");
    res.send("Hello world! This is the root endpoint of the server.");
});

app.get('/system', (req, res) => {
    console.log("GET /system called.");
    res.write(`Operating System: ${os.type()}\n`);
    res.write(`CPU: ${os.cpus()[0].model}\n`);
    res.write(`CPU Architecture: ${os.arch()}\n`);
    res.write(`Total Memory: ${(os.totalmem() / Math.pow(10, 9)).toFixed(2)} GB`);
    res.send();
});

module.exports = app;
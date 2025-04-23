const app = require('./src/app.js');
const PORT = 3000;

app.listen(PORT, () => {
    console.log("===================================");
    console.log(`Server listening on port ${PORT}...`);
    console.log("===================================");
});
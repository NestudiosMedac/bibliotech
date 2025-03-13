function* extracNumber(attemps) {
 for (let i = 0; i < attemps; i++) {
    yield Math.floor(Math.random()*91);//entre 1 y 90, y lo cede gracias al yield
 }
}

let cpu = 0; 
let player = 0;

// Tiradas CPU   
let cpuGenerator = extracNumber(2);
cpu += cpuGenerator.next().value;
cpu += cpuGenerator.next().value;

// Tiradas de player

let playerGenerator = extracNumber(2);
player += playerGenerator.next().value;
player += playerGenerator.next().value;

console.log("CPU:" + cpu);
console.log("PLAYER:" + player);


if( cpu > player ){
   console.log("CPU WINS");
}else{
   console.log("PLAYER WINS"); 
}
 

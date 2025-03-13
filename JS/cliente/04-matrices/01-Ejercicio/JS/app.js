// Definicion de Funciones

let func= new Function("a","b","return a*b");//dentro defines lo que haces
let resultado= func(10,10);
console.log(resultado);

//funcion autoinvocada
(function(){
    let msg="hola!";
    console.log(msg);
})();//se usan los ultimos parentesisis como parametros

//funcion anonima

//let a=10;
//let b=10;

resultado=function(a,b){return a*b};
console.log(resultado(10,10));

//Notacion flecha--arrow functions

const arrowF = (a,b)=> a*b;
console.log(arrowF(10,10));
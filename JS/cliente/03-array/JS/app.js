let autos=['BMW','Audi','Volvo'];

console.log(autos);
console.log(typeof autos);

let item = new Array(1,6);
console.log(item);
let items =new Array(6);
console.log(items);

//let pets =new Array ('perro','gato','periquito');
let pets =['perro','gato','periquito'];
console.log(pets);
console.log(pets.length);
console.log(pets[0]);

//iterar en el array
let len=pets.length;
for(let i=0;i<len;i++){//<= len-1
    console.log(pets[i]);
}
pets.push('rana');//añade al final del array
console.log(pets);
pets.push('pulpo','barco');
console.log(pets);
pets[8]='Zapato';
console.log(pets);

items[2]='toro';
console.log(items);

console.log(pets.pop());//te lo muestra y lo tira 
console.log(pets);// undefined no se quitaria
console.log(pets.shift());//igual que pop pero por delante, el primero
console.log(pets);
console.log(pets.unshift('patata'));//unshift añade el primero
console.log(pets);


const months = ['Jan','March','April','June'];//declara el array
//Param1: posicion, param2:num de elementos a borrar(deleteCount), param3-N:elemtos
months.splice(1,0,'Feb');//Primer numero es la posicion y el 0 añade
console.log(months);

months.splice(1,1,'May');//Primer numero es la posicion y el 1 reemplaza
console.log(months);

months.splice(5,2,'July','Agost','Sept');//Primer numero es la posicion y el 2 añade y concatena(los añade tos)
console.log(months);

months.splice(2,3,'July','Agost','Sept');//Primer numero es la posicion y el 3 o mas, elimina esa cantidad y mete lo que quieras concatenar
console.log(months);

let eliminado=months.splice(4);//corta por ahi sin incluirla para atras pero empezando por 1 en vez de 0

console.log(months);
console.log(eliminado);

//ordenar arrays
console.log(months.reverse());//lista al reves
console.log(months.sort());//ordena alfabeticamente

//Partes de una palabra, frase, vectores... delimitados por una separador

let cadena='Javascript es un lenguaje de programación';
let vecto='12,23,45,65,34,4,5,6';

let palabras=cadena.split(' ');
let numeros=vecto.split(',');


console.log(palabras);
console.log(numeros);

//busqueda de una posicion

let posicion=months.indexOf('Jan');
console.log(posicion);

months.push('Apr');
months.push('Jun');

//Slice, rebana
console.log(months.slice(2));
console.log(months);
console.log(months.slice(-1)); //con el -1 empieza por atras

//replace, reemplaza

console.log(cadena.replace('Java','ECMA'));

cadenaCambiada=cadena.replace('Java','ECMA');
console.log(cadenaCambiada);
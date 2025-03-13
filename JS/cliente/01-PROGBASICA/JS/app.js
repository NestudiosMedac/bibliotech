//alert("Hola mundo, Fichero 25")

// "use strict"

// Activamos Quokka con ctrl+shift+p

console.log("Hola mundo");

nombre = 'Jose Miguel';
console.log(nombre);//para saber el resultado o lo que contiene una variable

var nombre = null;
let a = 3;
let b = '2';
let c = a + b;
console.log(c);
console.log(typeof a);
console.log(typeof b);
let ok = true;
console.log(typeof ok);// y con typeof su tipo
console.log(a + nombre);
nombre = 'Jose Miguel'
console.log(a + nombre);
console.log(typeof nombre);

if (b > a) {
    console.log("");
} else {
    console.log("");
}

let objeto1 = Symbol(1);
console.log(typeof objeto1);//es igual que un id, es una descripcion
console.log(objeto1);

let objeto2 = Symbol(1);
console.log(typeof objeto2);//es igual que un id, es una descripcion
console.log(objeto2);

let horaDia = 127;
let mensaje = "Actualmente son las " + horaDia + "";

if (horaDia >= 6 && horaDia <= 12 || horaDia >= 1 && horaDia < 6) {

    console.log(mensaje + ".Buenos dias");
} else if (horaDia > 12 && horaDia <= 18) {
    console.log(mensaje + ".Buenas tardes");
} else if (horaDia > 18 && horaDia <= 24) {
    console.log(mensaje + ".Buenas noches");

} else {
    console.log(mensaje + ".Esto que carajos es?");
}

let z = 2;
let y = '2';

if (z == y) {
    console.log("Son iguales")
} else {
    console.log("No son iguales")
}
// El operador ternario de JavaScript es un operador condicional que tiene tres operandos.
// Se usa para tomar una decisión basada en una // expresión que se evalúa como true o false
// Es una forma abreviada de la sentencia if else que crea código más limpio, fácil de entender 
// y rápido de escribir.
let resultado = (z === y) ? "Verdadero" : "Falso";//1:0
console.log(resultado);

let miNumero = "18";
console.log(miNumero);

if (isNaN(miNumero)) {
    console.log("no es un numero");
}
miNumero = Number(miNumero);
console.log(miNumero);

let miString = String(miNumero);
console.log(miString);

let contador = 0;

while (contador < 3) {
    console.log(contador++);
    //contador++;
}
let cont = 0;
do {
    console.log(cont++);
} while (cont < 3);

for (let i = 0; i < 5; i++) {
    console.log(i);
}

let mes = 1;
let estacion = "desconocida";

switch (mes) {
    case 1: case 2:
        estacion = "Invierno";
        break;
    case 3: case 4: case 5:
        estacion = "Primavera";
        break;
    case 6: case 7: case 8:
        estacion = "Verano";
        break;
    case 9: case 10: case 11:
        estacion = "Otoño";
        break;
    default:
        estacion = "Mes erroneo";

}
console.log(estacion);

for (let i = 0; i <= 3; i++) {
    for (let j = 0; j <= 3; j++) {
        console.log(i, j);
        //se pueden usar breaks y continue PERO TA FEO, Jaime lloraria. Puede ser util
    }
}

let objeto = { nombre: "Jose Miguel", apellido: "Cabezuelo", edad: 34 }     // var es una variable global
console.log(typeof objeto);

let marcaCoches = ['BMW', 'Audi', 'Renault', 'Ford'];
console.log(marcaCoches);

for (let j = 0; j < marcaCoches.length; j++) {
    console.log(marcaCoches[j]);
    //se pueden usar breaks y continue PERO TA FEO, Jaime lloraria. Puede ser util
}
//Definir clase
class Persona {
    constructor(nombre, apellido, edad) {
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
    }
    toString() {//se puede cambiar el nombre, en vez de toString puede ser un pasoaTexto
        return `${this._nombre} ${this._apellido}, edad: ${this._edad}`;//se puede poner en  vertical y se ponen los saltos de linea solo
    }
}
console.log(Persona);
console.log(typeof Persona);

//Probar clase Perona
let persona1 = new Persona("Juan", "Perez", 43);
console.log(persona1);
console.log(persona1.toString());
const objeto3 = {
    nombre: "La siempre",
    apellido: "Inteligente",
    edad: 58
}
let persona2 = new Persona(objeto3.nombre, objeto3.apellido, objeto3.edad);
console.log(persona2.toString());
//Funciones
var aa = 4;//es de fuera, variable global, let seria "local"
var bb = 5;
// let aa = 4;
// let bb = 5;
function miFuncion(xx, yy) {//no hace poner el tipo
    let aa = 4;//Lee antes la local
    let bb = 5;
    console.log("Suma: " + (xx + yy));//muestra
    console.log("Suma: " + (aa + bb));//muestra
    console.log(`Suma:  ${aa + bb}. Más texto`);
    return (xx + yy);//muestra y devuelve

}
let result = (miFuncion(7, 7));
console.log(result);
console.log(typeof miFuncion);

function Sumar() {
    let salir = false;
    do {
        var aaa = prompt("Dime el número A:"); //promt devuelve un String
        if (isNaN(aaa)) {
            alert("Error.Introduce un numero: ");
        }
        salir = true;
    } while (false);
    salir = false;
    do {
        var bbb = window.prompt("Dime el número B:");
        if (isNaN(bbb)) {
            alert("Error.Introduce un numero: ");
        }
        salir = true;
    } while (false);
    //debes castearlo a Number
    salir = false;
    if (!isNaN(aaa) || !isNaN(bbb)) alert(`La suma es: ${aaa + bbb}`);

}

// Math.random() devolverá un número de coma flotante mayor o igual que 0 y menor que (pero nunca igual a) 1.
// En otras palabras, 0 <= x < 1
function getRandomInt(max) {
    return Math.floor(Math.random() * max);
}
  
console.log(getRandomInt(3));
// Salida: 0, 1 or 2
  
console.log(getRandomInt(1));
// Salids: 0
  
console.log(Math.random());
// Salida: un número de 0 a <1
// Generar número aleatorio entre mínimo y máximo sin incluir extremos
function getRandomArbitrary(min, max) {
    return Math.random() * (max - min) + min;
}
// Generar número aleatorio entre mínimo y máximo incluyendo extremos (números enteros)
function getRandomEnteros(min, max) {
    return Math.random() * (max - min + 1) + min;
}
// Generar número aleatorio entre mínimo y máximo incluyendo extremos
function getRandomIntInclusive(min, max) {
    const minCeiled = Math.ceil(min);
    const maxFloored = Math.floor(max);
    return Math.floor(Math.random() * (maxFloored - minCeiled + 1) + minCeiled);
}
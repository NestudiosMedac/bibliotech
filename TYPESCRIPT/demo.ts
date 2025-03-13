let mensaje: string = "hola mundo";
console.log(mensaje);

let numero:number = 100;
console.log(numero);

let esviernes:boolean = false;
console.log(esviernes);

let real:number = 1.43;
let binario:number = 0b101;
console.log(typeof binario);

let suma:number = real + binario + numero;
console.log(suma);
 
let comparacion:boolean;
comparacion=real>2;
console.log(comparacion);

let octal:number=0o45;
console.log(octal);

let cadena1:string = "Hola";
let cadena2:string ='Hola';
let cadena3:string = `El numero es ${suma}`;
let unioncadena:string = cadena1 + cadena2;
console.log(typeof cadena1);
console.log(typeof cadena2);
console.log(unioncadena);

let arreglo1:number[]=[1,2,3,4];
let arreglo2:Array<number>=[5,6,7,8];

console.log(arreglo1);
console.log(arreglo2);
console.log(typeof arreglo1);
console.log(typeof arreglo2)
let arreglocadena: string[]=["TS","JS","PHP"];
//cadena2 = false; // no te permite cambiar el tipo tienes que pasarlo rollo parse
arreglocadena.push("23");
let tupla:[string, number, boolean]=["Carmina", 30, true];
console.log(tupla[0]);

enum semaforo{"Rojo"=3, "Naranja", "Verde"};
semaforo.Naranja
console.log(semaforo);
let valor = semaforo.Rojo;
switch(valor){
    case 3:
        console.log("No pases");
        break;
    // case 4:
    //      console.log("Precaucion");
    //      break;
    // case 5:
    //     console.log("Pasa");
    //     break;
    default:
        console.log("Adios");
        break;
}


let nose:any;
nose = "hola";
nose = 8;
// nose. no te muestra ninguna funcion
nose = null;
// type e interface son inguales salvo que se usa interface con clases
interface Persona{
    nombre:string,
    apellido:string,
    edad:number,
    estado:boolean
}
let personaCarmina:Persona = {
   nombre : "Carmina",
   apellido : "Cervera",
   edad : 52,
   estado : true
}
console.log(personaCarmina);
console.log(personaCarmina.edad);





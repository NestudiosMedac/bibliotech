/**Ejercicio 1: Añadir a una página HTML un script que muestre un alert de la
siguiente forma:
a) Añadimos el alert de forma interna sin función. En el HTML
b) Añadimos el alert en un evento en un botón. En el HTML
c) Igual que el punto anterior, pero usamos una función.
d) Igual, pero la función en un archivo externo*/

/*d)*/
function alertaConMensajeEx(){
   let mens= alert("Hola Mundo");
   return (mens);
}

/**Ejercicio 2: Crear una página con una imagen y un botón. Añadir el código necesario
para que cuando pulse el botón salga un alert (“hola”) y cuando pase el ratón
encima de la foto (onmouseover) salga un alert(“adios”).
*/

function PasarPorEncima(){
   let mens= alert("Adios");
   return (mens);

}
function BotonHola(){
   let mens= alert("Hola");
   return (mens);
}

/**
 * Ejercicio 3: Crear una página web con dos botones. Uno hace un alert normal, y el otro
hace un document.write ¿Que sucede al usar document.write?. Limpia el documento y escribe lo que has escrito
*/
/**
 * Ejercicio 4: A través de un prompt, pide el nombre al usuario y saludalo con un alert de
la siguiente forma: “Bienvenid@ a mi página XXXXXX” (siendo XXXXXX el nombre
que ha introducido el usuario).
 */

function saludo(){
let nombre=prompt("Como te llamas?");
let alerta=alert("Bienvenidx a mi página "+nombre);
   return(alerta)
}

/**
 * Ejercicio 5: Pedir dos valores numéricos con prompt y mostrar su suma, resta,
multiplicación, división y resto.
 */
function PedirNum() {
  let num = prompt("Dime un numero");
  while (isNaN(num)){
      num=prompt("Illo mete un numero");
  } 

  return (Number(num));
}
function Calcular(){
   let num1=PedirNum();
   let num2=PedirNum();

   let resultado=
   "La suma es: "+(num1+num2)+", la resta es: "+(num1-num2)+
   ", la multiplicación es: "+(num1*num2)+", la división es: "+(num1/num2)+
   " y el resto es: "+(num1%num2);

  alert(resultado);
}

//Calcular();

/**
 * Ejercicio 6: Crea un script que pida al usuario un numero entero positivo N mayor a 0.
Hay que controlar que el numero introducido sea correcto. Si no es así se volverá a pedir.
A continuación, debe realizar lo siguiente:
a) Calcular los divisores del número N y mostrarlos.
b) Calcular la suma de los cuadrados de los divisores obtenidos en el paso anterior y
mostrarla.
c) Indicar si esa suma es un cuadrado o no (con una frase por pantalla)
 */

function PedirNum() {
  
   let num=prompt("Dime un numero");
      while(num<=0 || isNaN(num)){
         num=prompt("Tiene que ser un numero mayor a 0");
      }
      return(num);
 }


function divisores() {
  let numero = PedirNum();
  let res="";
  let suma=0;
 
  for (let i = 0; i <= numero; i++) {
    if (numero % i == 0) {
       res+=i+" ";
       suma+= Math.pow(i,2);
    }
  }
  alert("Los divisores son: "+(res));
  alert("El resultado de la suma de los cuadrados de los divisores es: " +(suma));
  return (suma);
 }
 

function raiz(){
   let raiz=divisores();
   if(isNaN(Math.pow(raiz,2))){
      alert("La suma: "+suma+", NO es un cuadrado perfecto.")
   }else{
      alert("La suma: "+suma+", es un cuadrado perfecto.")

   }
}

raiz();
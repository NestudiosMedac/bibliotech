/***Ejercicio 3: Concatenar dos arrays A y B de la siguiente forma: A0, B0, A1, B1, A2,
B2, ..., An, Bn. Los vectores pueden tener longitud distinta (requiere controlarlo).
Nota: los valores de cada vector se solicitarán separados por “,"" */

/**function PedirCad(mens) {
  let cadena=prompt(mens);
     return(cadena);
}

alert("Si no metes las dos listas igual de largas tienes que volver a escribir las dos...")
let cadenaA=PedirCad("Dime la primera lista separada con coma ,:");
let cadenaB=PedirCad("Dime la segunda lista separada con coma ,:");

while(cadenaA.length != cadenaB.length){
  alert("toca otra vez..");
  cadenaB=PedirCad("Dime la segunda lista separada con coma ,:");
  
}

let ArrayA=cadenaA.split(',');
let ArrayB=cadenaB.split(',');

let ArrayNuevo=[];
let boolean=true;
  for(let i=0; i<ArrayA.length; i++){
   ArrayNuevo.push(ArrayA[i]);
   if(boolean){
   ArrayNuevo.push(ArrayB[i]);
   boolean=false;
 }
   boolean=true;
 }
*/
//console.log(ArrayNuevo);
//1,2,3,4
//A,B,C,D


//ejemplo profe

//forma con repetidos
function repetidos(array, elem){//nos dice si ese elemento esta repetido o no
  let cont= 0;
  for( let i=0; i<array.length; i++){
      if( array[i] === elem ){
        cont++;
      }
  }
  if( cont == 1){//minimo tiene que ser un uno
    return false;
  }else{
    return true;
  }

}
function copiaUnicos1(array1,array2){
  let arrayFinal=[];

  // Agregar elementos unicos de array1 que no esten repetidos en array1 ni esten en array2
  for(let i=0; i<array1.length; i++){
    if(array2.indexOf(array1[i])===-1/*mira en si mismo*/  && !repetidos(array1,array1[i])/*mira en el otro*/ ){//-1 dice que no existe o no esta 
      arrayFinal.push(array1[i]);

    }
  }
  // Agregar elementos unicos de array2 que no esten repetidos en array2 ni esten en array1
  for(let i=0; i<array2.length; i++){
    if(array1.indexOf(array2[i])===-1 && !repetidos(array2,array2[i])){//-1 dice que no existe o no esta la POSICION
      arrayFinal.push(array2[i]);

    }
  }
  return arrayFinal;
  
}


//forma con esUnico
function esUnico(array, elem){
  return array.indexOf(elem) === array.lastIndexOf(elem);
}
function copiaUnicos2(array1,array2){
  let arrayFinal=[];
  // Agregar elementos unicos de array1 que no esten repetidos en array1 ni esten en array2
  for(let i=0; i<array1.length; i++){
    if(array1.indexOf(array2[i]) === -1  && !repetidos(array2,array2[i])){
      if(array1.indexOf(array2[i])=== -1 && esUnico(array2,array2[i])){
        arrayFinal.push(array2[i]);}
      
    } 
  }
  return arrayFinal;
}



function copiaUnicos3(array1,array2){
  let arrayFinal=[];

  // Agregar elementos unicos de array2 que no esten repetidos en array2 ni esten en array1
  for(let i=0; i<array2.length; i++){
    if(array1.indexOf(array2[i])===-1 && !repetidos(array2,array2[i])){//-1 dice que no existe o no esta la POSICION
      arrayFinal.push(array2[i]);
    }
    if(!array1.includes(array2[i]) &&!repetidos(array2, array2[i])){
      arrayFinal.push(array2[i]);
    }
  
    }
  return arrayFinal;
  
}

//copiaUnicos1 es el primer ejemplo, copiaUnicos2 es el segundo, copiaUnicos3 es el tercer, las dos ultimas no van

let resultado=copiaUnicos1([77, "ciao", 8, "ciao", 42],[77,42,9]);
console.log(resultado);//salida [8,9]
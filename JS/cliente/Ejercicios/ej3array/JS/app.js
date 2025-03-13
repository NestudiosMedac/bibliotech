/***Ejercicio 8: Escriba una función que reciba dos arrays y devuelva un nuevo array con
los elementos que solo aparecen una vez en total (ya sea en el primer o en el segundo
array). El orden debe ser: primero los que están en el primer array y luego los que están
en el segundo.
Ejemplos:
[1, 2, 3, 3] y [3, 2, 1, 4, 5]) ==> [4, 5]
["Ray", "Jose", "Dani"] y ["Dani", "Jose", "Ivan"]) ==> ["Ray","Ivan"]
[77, "ciao"] y [78, 42, "ciao"]) ==> [77, 78, 42]
[1, 2, 3, 3] y [3, 2, 1, 4, 5, 4]) ==> [4,5] */

let nombres1=["Ray", "Jose", "Dani"];
let nombres2=["Dani", "Jose", "Ivan"];

function unicos(array1,array2) {
  let boolean=true;

for (i=0;i<array1.length;i++){

  console.log(array1[i]);

}

  for(j=0;j<array2.length;j++){

    console.log(array2[i]);
        
      }

}

unicos(nombres1,nombres2);


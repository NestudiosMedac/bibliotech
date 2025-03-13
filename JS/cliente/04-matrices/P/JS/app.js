
//Matrices
/*let matriz=[];//primero creo un array
let i=prompt("Dime el tamaño de columna:");//digo su tamaño

for(let j=0; j<i; j++){
    matriz[j]=new Array(i);
}
*/
//let fila=prompt("Dime el tamaño de fila:");
//let columna=prompt("Dime el tamaño de columna:");

function CreaYPintaMatriz(fila, columna){// en 01-ejercicio esta todo bien hechp

let matriz=new Array(columna);
    //inicializamos la matriz
    for(let i=0; i<columna; i++){
        matriz[i]=new Array(fila);//[] para ponerlo vacio
    }
    //rellenamos valores
    for(let i=0; i<fila; i++){
        for(let j=0; j<matriz[i].length; j++){//matriz[i].length=columna
            matriz[i][j]=j;//arriba abajo
            }
            console.log(matriz[i]);
    }

}
//CreaYPintaMatriz(fila,columna);


autos=[['BMW1','BMW2','BMW3'],['Audi1','Audi2','Audi3'],['Tesla1','Tesla2','Tesla3']];

        console.log(autos);

        /**C(i)                                    
         * 0  [ 'BMW1', 'BMW2', 'BMW3' ],        j F
         * 1  [ 'Audi1', 'Audi2', 'Audi3' ],     j F
         * 2  [ 'Tesla1', 'Tesla2', 'Tesla3' ]   j F
         *       i          i          i
        */

        function PintaMatriz(autos){
            let res="";
            
            for(let i=0; i<autos.length; i++){
                for(let j=0; j<autos[i].length; j++){
                   res+= autos[i][j]+",";
                    }
                    console.log(res);
                    res="";
            }
        }

        PintaMatriz(autos);

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
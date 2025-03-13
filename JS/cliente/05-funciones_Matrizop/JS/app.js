
//multiplos de el numero que introduzca


function PedirPorPantalla(mens){
let numero=prompt(mens);
while(isNaN(numero)||numero<=0){
    numero=prompt("Introduce un numero valido");
}
return (Number(numero));
}




//crear matriz
function CrearMatriz(fila, columna) {
    let matriz = new Array(fila);

    for (let i = 0; i < fila; i++) {
        matriz[i] = new Array(columna);
    }

    return matriz;
}

//relleno
function RellenarMatriz(matriz) {
    for (let i = 0; i <matriz.length; i++) {//fila
        let num = PedirPorPantalla("Introduce un número de 0 al 9");//pide un numero por cada fila
        for (let j = 0; j < matriz[i].length; j++) {//columna
            matriz[i][j] = num * (j + 1);// relleno con los multiplos de los numeros 
        }
    }
    return matriz;
}
function getRandomEnteros(min, max) {
    return Math.floor(Math.random() * (max - min + 1) + min);
}
function RellenarMatrizAleatoria(matriz) {
    for (let i = 0; i <matriz.length; i++) {//fila
        let num = getRandomEnteros(1,99);//pide un numero aleatorio por cada fila
        for (let j = 0; j < matriz[i].length; j++) {//columna
            matriz[i][j] = num* (j + 1) ;// relleno con los numeros aleatorios 
        }
    }
    return matriz;
}
//muestro
function PintaMatriz(matriz) {
    let res = "";

    for (let i = 0; i < matriz.length; i++) {
        for (let j = 0; j < matriz[i].length; j++) {

            if (matriz[i][j] < 10) {//añade un 0 en caso de que sea una unidad en ved de decima
                res += "0" + matriz[i][j] + " "
            } else {
                res += matriz[i][j] + " ";

            }
        }

        console.log(res);
        res = "";
    }
}
let fila =PedirPorPantalla("Dime el tamaño de filas:");
let columna = PedirPorPantalla("Dime el tamaño de columna:");//digo su tamaño
let res=CrearMatriz(fila,columna);
res=RellenarMatrizAleatoria(res);
PintaMatriz(res);
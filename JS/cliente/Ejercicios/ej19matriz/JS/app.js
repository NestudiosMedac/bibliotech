// Ejercicio 19: La Búsqueda del Tesoro
// Crea un script que simule el siguiente juego:
// En un tablero, NxM la maquina colocará de forma aleatoria varias minas y un tesoro. El
// usuario intentará averiguar la posición del tesoro indicando la posición del tablero que
// quiere mirar. Podrá seguir jugando mientras no encuentre una de las minas (muere) o el
// tesoro (gana).
// Para este ejercicio usa un tablero de 4x5 con 3 minas.
// Hay que asegurarse que tanto las minas como el tesoro no se colocan en posiciones ya
// ocupadas.
// En cada iteración del juego se pintará el tablero y se preguntará al usuario qué
// coordenadas quiere mostrar del tablero.

// Usa la consola para pintar el tablero de la siguiente forma:
// • Si una coordenada aún no ha sido visitada, pinta un *
// • Si una coordenada ha sido visitada y no tiene nada, pinta un _
// • Si una coordenada ha sido visitada y tiene una mina, pinta una X (y mata al
// jugador)
// • Si una coordenada ha sido visitada y tiene el tesoro, pinta un € (y el jugador gana)
// Puedes pedir al usuario las coordenadas como quieras: ambos valores de golpe o de uno
// en uno. Lo único a tener en cuenta es que, para el usuario, las coordenadas empiezan en
// 1, no en 0.


// Mejora: si hay una mina a una casilla de distancia de la posición que ha descubierto el
// usuario, muestra un aviso indicando que tenga cuidado (pero no reveles la posición de la
// mina).
//generar random
function getRandomEnteros(min, max) {
  return Math.random() * (max - min + 1) + min;
}
//crear
let tablero = new Array(5);//5 filas

for (let z = 0; z < 5; z++) {//5 filas
  tablero[z] = new Array(4);
}
Pos_ale1=4;
Pos_ale2=2;
Pos_ale3=2;
Pos_ale4=1;
Pos_ale5=0;
Pos_ale6=0;


//rellenar
for (let i = 0; i <tablero.length; i++) {
  for (let j = 0; j < tablero[i].length; j++){
    tablero[i][j] = "." ;
    if(i==Pos_ale1 && j==Pos_ale2){
      tablero[i][j] = "BOOM" ;
    }
    if(i==Pos_ale3 && j==Pos_ale4){
      tablero[i][j] = "BOOM" ;
    }
    if(i==Pos_ale5 && j==Pos_ale6){
      tablero[i][j] = "BOOM" ;
    }
  }
}
console.log(tablero);
let res = "";

    for (let i = 0; i < tablero.length; i++) {
        for (let j = 0; j < tablero[i].length; j++) {
                res += "*";
        }
        console.log(res);
        res = "";
    }
    
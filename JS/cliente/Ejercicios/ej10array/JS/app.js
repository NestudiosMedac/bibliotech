// Lista de nombres de ejemplo
const nombres = [
   "Juan",
   "Ana",
   "Sara",
   "David",
   "Pablo",
   "Luz",
   "Mark",
   "Irene",
   "Nina",
   "Alba",
 ];

 function PedirCad(mens) {
  
   let cadena=prompt(mens);
      return(cadena);
 }
 function crearArrayCad(cadena){
   let nuevosAmigos=cadena.split(',');
   return nuevosAmigos;
 }
function filtrarAmigos(arrayCreado){
let amigosJose=[];
   for(let i=0;i<arrayCreado.length;i++){
       if(arrayCreado[i].length == 4){
      amigosJose.push(arrayCreado[i]);
       }
   }
   console.log(amigosJose);

}

let amiwitos=crearArrayCad(PedirCad("Dime una lista de nombres separados por , :"));
filtrarAmigos(amiwitos);


//Juan,Paco,Antonio, julia,ana
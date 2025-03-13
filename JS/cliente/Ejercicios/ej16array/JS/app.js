function pedirComensales() {
  let num=prompt("Cuantos clientes son?");
  while(isNaN(num) || num>4) {
   num=prompt("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
   }
  if(num === -1 ){
    alert("Fin del programa");
    return(num);
  }else{
    return(num);
  }
     
}
function pedirMesas() {
  let num=prompt("Cuantas mesas hay?");
  while(isNaN(num)) {
   num=prompt("Lo siento, introduce un numero de mesas");
  }
  return(num);
}
function sentar(numComensales){
  let salir=false;
  let cont=0;
  for(i=0;i<mesas.length;i++){
    if (mesas[i]==0 && !salir && numComensales!=-1 && numComensales<=4){
      mesas.splice(i,1,numComensales);
      alert("Por favor, Siéntese en la mesa "+(i+1));
      break;
    }
    if(mesas[i]!=0){
      cont++;
    }
    }
    if(cont==mesas.length){
      alert("Mesas llenas");
    }
    salir=false;
    console.log(mesas);
  }


  let cantMesas=pedirMesas();
  let mesas=[];
  for(i=0;i<cantMesas;i++){
  mesas.push(parseInt(Math.random() * (4 - 0 + 1) + 0));
  }
  console.log(mesas);

let comensales;
do{
comensales=pedirComensales();
sentar(comensales); 
}while(comensales != -1);


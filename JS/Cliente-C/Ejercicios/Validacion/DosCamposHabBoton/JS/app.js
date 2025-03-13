console.log("Conectado");
// document.getElementById("apellidos").addEventListener('input', verificar);
// document.getElementById("nombre").addEventListener('input', verificar);

document.getElementById("nombre").addEventListener('focusout', comparar);

// function verificar(){
//     let apellidos= document.getElementById("apellidos").value;
//     let nombre= document.getElementById("nombre").value;

//     if(apellidos !== "" && nombre !== ""){
//         document.getElementById("enviar").disabled=false;
//     }else{
//         document.getElementById("enviar").disabled=true;

//     }

//}


// Ejercicio de contraseñas iguales
function comparar(){
     let apellidos = document.getElementById("apellidos").value;
    let nombre = document.getElementById("nombre").value;

   if(apellidos === nombre){
        document.getElementById("enviar").disabled=false;
   }else{
        document.getElementById("enviar").disabled=true;
        document.getElementById("nombre").focus();
    }

}
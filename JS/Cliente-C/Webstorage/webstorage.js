document.getElementById("crear").addEventListener("click", crear);
document.getElementById("modificar").addEventListener("click", modificar);
document.getElementById("consultar").addEventListener("click", consultar);
document.getElementById("eliminar").addEventListener("click", eliminar);


// //Session Storage
// function crear(){
//     sessionStorage.setItem("usuario1","Carmina");
//     sessionStorage.setItem("usuario2","Francis");
// }

// function consultar (){
    
//     let valor1 = sessionStorage.getItem("usuario1");
//     let valor2 = sessionStorage.getItem("usuario2");

//     //alert(`La variable usuario tiene almacenado ${valor}`);
//     document.getElementById("resultado").innerHTML=`La variable usuario uno tiene almacenado ${valor1} y la variable usuario dos tiene almacenado ${valor2}`;
// }

// function modificar (){
//     sessionStorage.setItem("usuario1", "AureliotieneGrinder");
    
// }
// function eliminar (){
//     sessionStorage.removeItem("usuario1");
    
// }


// //Local Storage

// function crear(){
//     localStorage.setItem("usuario1","Carmina");
//     localStorage.setItem("usuario2","Francis");
// }

// function consultar (){
    
//     let valor1 = localStorage.getItem("usuario1");
//     let valor2 = localStorage.getItem("usuario2");

//     //alert(`La variable usuario tiene almacenado ${valor}`);
//     document.getElementById("resultado").innerHTML=`La variable usuario uno tiene almacenado ${valor1} y la variable usuario dos tiene almacenado ${valor2}`;
// }

// function modificar (){
//     localStorage.setItem("usuario1", "AureliotieneGrinder");
    
// }
// function eliminar (){
//     localStorage.removeItem("usuario1");
    
// }

//Cookies
function crear(){
    document.cookie="usuario=Mario; expires=Thu, 6 Feb 2025 12:00:00 UTC; path=/";
}

function consultar (){
    alert(`La variable usuario tiene almacenado ${document.cookie}`);
}

function modificar (){
    document.cookie="usuario=Mario2; expires=Thu, 6 Feb 2025 12:00:00 UTC; path=/";
    
}
function eliminar (){
    document.cookie="usuario=Mario; expires=Sun, 2 Feb 2025 12:00:00 UTC; path=/";
    
}
document.getElementById("crear").addEventListener("click", crear);
document.getElementById("incrementar").addEventListener("click", incrementar);
document.getElementById("decrementar").addEventListener("click", decrementar);
document.getElementById("consultar").addEventListener("click", consultar);


function crear(){
    sessionStorage.setItem("usuario","0");
}
function incrementar(){
    sessionStorage.setItem("usuario", Number(sessionStorage.getItem("usuario"))+1);

}

function decrementar (){
    sessionStorage.setItem("usuario", Number(sessionStorage.getItem("usuario"))-1);

}

function consultar (){
    let valor1 = sessionStorage.getItem("usuario");
    alert(`La variable usuario tiene almacenado ${valor1}`);
}
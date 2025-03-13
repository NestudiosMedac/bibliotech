console.log("Working...");

function irse(){
    alert("Tu k ase");
}

function atencion(){
    let edad= document.getElementById('edad'); // ubicar donde trabajar 
    edad.style.backgroundColor= "red"; 
}

function cambio(){
    let dni= document.getElementById('dni'); // ubicar donde trabajar 
    dni.style.backgroundColor= "blue"; 
}

function nocopies(){
    alert("No copies >:c");
    navigator.clipboard.writeText(""); // quitarle lo que ha copiado
}
function nocortes(){
    alert("No cortes >:c");
}
function nopegues(){
    alert("No me peges >:,c");
}

function cambiarcolor(){
    let caja= document.getElementById('caja'); // ubicar donde trabajar 
    
    caja.style.backgroundColor = "blue"; 
    caja.style.width = "50px"; 
    caja.style.height = "50px"; 
}

function reiniciar(){
    alert("Vas a reiniciar :,c");
}
function suena(){
    alert("🎶");
}


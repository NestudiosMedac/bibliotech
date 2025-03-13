let galeria = document.getElementById('contenedor');
let btnAnadir = document.getElementById('btnAnadir');
let btnLimpiar = document.getElementById('btnLimpiar');

btnAnadir.addEventListener('click', aniadirImagen);

function aniadirImagen(){
    btnLimpiar.removeAttribute("disabled");
    let ruta = prompt("Dime la ruta de la imagen a añadir: ");
    

    if(ruta == ""){
       let imgPred = document.createElement("img");
       imgPred.setAttribute("src","./img/fotopredeterminada.jpeg");
       galeria.append( imgPred);
    }else{
        let nuevaImg = document.createElement("img");
        nuevaImg.setAttribute("src","./img/"+ruta+".jpeg");//puede ser png
        nuevaImg.classList.add('foto');
        galeria.appendChild(nuevaImg);
    }

}


btnLimpiar.addEventListener('click', limpiarGaleria);

function limpiarGaleria(){
    while (galeria.querySelector("img")) {
        galeria.querySelector("img").remove();
    }
    btnLimpiar.setAttribute("disabled","true");
}

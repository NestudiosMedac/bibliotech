console.log("javasxript");

let creaAnuncio = document.getElementById("incluyeAnuncio");

creaAnuncio.addEventListener("click", incluirAnuncio);

function incluirAnuncio(){
    //Pedir al usuario la direccion de la imagen y el enlace a donde vamos a apuntar

    let pathImg = prompt("Dirección de la imagen", "./img/foto1.jpg");
    let urlEnlace = prompt("URL del enlace", "https://www.marca.es");

    //crear un div
    let nuevoHijo = document.createElement("div");

    //creo el enlace
    let enlace = document.createElement("a");
    enlace.href=urlEnlace;
    enlace.textContent = prompt("Dime el texto del enlace");

    //creo la imagen
    let imagen = document.createElement("img");
    imagen.src=pathImg;
    imagen.alt = "Imagen alternativa";
    imagen.style.width =" 100px";
    imagen.style.height =" 100px";
    
    //agregar nuestro hijo (div)

    nuevoHijo.appendChild(imagen);
    nuevoHijo.appendChild(enlace);

    let seccion = document.getElementById("secctionArticles");

    seccion.appendChild(nuevoHijo);



}
function inicioDOM() {
    console.log("Dom cargado");
    document.body.style.background = 'cyan';

    //document.getElementById
    let titulo = document.getElementById("title");
    console.log(titulo.innerHTML);// texto interno y lo que pille(enlaces, img), si esta dentro de la etiqueta html
    console.log(titulo.textContent);//SOlO enseña el texto
    console.log(titulo.textContent.length);

    //document.getElementsByName
    let up_name = document.getElementsByName("up");
    console.log(up_name[0]);
    console.log(up_name[1]);//nos enseña todo
    console.log(up_name[0].tagName);//nos dice el tipo
    console.log(up_name[1].tagName);

    //document.getElementsByTagName
    let parrafos = document.getElementsByTagName("p");
    console.log(parrafos);


    //document.getElementsByClassName()
    parrafos = document.getElementsByClassName("parrafos1");
    console.log(parrafos);
    console.log(`Número de párrafos que tengo: ${parrafos.length}`);
    for (let i = 0; i < parrafos.length; i++) {
        if (i == 2) {
            parrafos[i].innerHTML = "Párrafo cambiado;"

        }
        console.log(`Parrafo ${i + 1}: ${parrafos[i].innerHTML}`);// texto interno dentro de la etiqueta html

    }
    //querySelector(), coge el primero
    let parrafo1 = document.querySelector('p.parrafos1');
    console.log(parrafo1);

    parrafo1 = document.querySelector('section.parrafos1');//el primer p de projects
    console.log(parrafo1);

    parrafo1 = document.querySelector('.projects p');//el primer p de projects
    console.log(parrafo1);


    // querySelectorAll()
    let elementos = document.querySelectorAll('p.parrafos10');
    console.log(`Número de párrafos que tengo: ${elementos.length}`);
    for (let i = 0; i < elementos.length; i++) {

        console.log(`Parrafo ${i + 1}: ${elementos[i].innerHTML}`);// texto interno dentro de la etiqueta html

    }
    // selecciono el DOM parcialmente
    let sectionProjects = document.getElementById('proyectos');
    console.log(sectionProjects);
    elementos = sectionProjects.querySelectorAll('p.parrafos1');
    console.log(sectionProjects);
    console.log(`Número de elementos que tengo: ${elementos.length}`);
    for (let i = 0; i < elementos.length; i++) {

        console.log(`Elemento ${i + 1}: ${elementos[i].innerHTML}`);

    }
}
let estado = true;
function cambioCabecera(cabecera) {
    // if (estado ){
    //     cabecera.style.color='red';
    //     estado = false;
    // }else{
    //     cabecera.style.color='black'; 
    //     estado = true;

    // }
    cabecera.style.color = cabecera.style.color === 'red' ? 'black' : 'red';
    //                     (         condicion            )  false     true


}

//Vamos a modificar el titulo 2
function cambioSubtitulo(elemento) {

    elemento.style.color = elemento.style.color === 'blue' ? 'pink' : 'blue';
    //                     (         condicion            )  false     true


}

// let elemento = document.getElementById('subtitle');
// elemento.style.color = 'blue';
document.getElementById('subtitle').onclick = cambioSubtitulo2;
//opcion 1 llamada a eventos desde JS
function cambioSubtitulo2() {
    let elemento = document.getElementById('subtitle');
    elemento.style.color = (elemento.style.color === 'blue') ? 'pink' : 'blue';
}


let titleh3 = document.getElementById('subsubtitle');
titleh3.addEventListener('click', cambioSubtitulo3);//es asociarlo, si le pones los parentesis no funciona
titleh3.addEventListener('dbclick', cambioSubtitulo3);

// elemento=document.getElementById('subsubtitle');
// elemento.style.color ='green';

function cambioSubtitulo3() {
    let elemento = document.getElementById('subsubtitle');
    elemento.style.color = (elemento.style.color === 'green') ? 'yellow' : 'green';
}

let c1 = document.getElementById('caja1');
 c1.addEventListener('click', cambioClase1);


 let c2 = document.getElementById('caja2');
 c2.addEventListener('click', cambioClase2);


//no puedes añadir parametros
function cambioClase1() {
//c1.style.background='black';
//c1.style.color='white';
  if (c1.classList.contains('caja--negra')){
    c1.classList.remove('caja--negra');//usar replace o toggle
    c1.classList.add('caja--roja');
  }else{
    // eejemplo de uso de replace
    c1.classList.replace('caja--roja','caja--negra');
    }

    // function cambiar() { //un ejemplo con toggle
    //     let cambio = document.querySelector("p");
    //     cambio.classList.toggle("uno");
    //     cambio.classList.toggle("dos");
    // }
}

function cambioClase2() {
    if (c2.classList.contains('caja--negra')){
        c2.classList.remove('caja--negra');
        c2.classList.add('caja--roja');
      }else{
        c2.classList.remove('caja--roja');
        c2.classList.add('caja--negra');
        }
}
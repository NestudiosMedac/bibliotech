// <!-- Ejercicio: Administrador de Lista de Tareas Objetivo 1. Crear una lista de
// tareas con opciones para añadir elementos en diferentes posiciones, reemplazar,
// y eliminar. 2. Cada botón realizará una acción específica usando uno de los
// métodos de manipulación del DOM. -->

// <!-- Api de elementos
// elemento.before(); Añade el nuevo elemento justo antes.
// elemento.after(); Añade el nuevo elemento justo después.
// elemento.prepend(); Añade el nuevo elemento justo antes del primer hijo.
// elemento.append(); Añade el nuevo elemento justo después del último hijo
// elemento.replaceChildren(); eliminar todos los hijos y los cambia por el nuevo elemento.
// elemento.replaceWith(); se sustituye el elemento por el nuevo.
// elemento.remove(); elimina el propio elemento. -->

console.log("estoy");

let btnAgregarAntes = document.getElementById('btnAgregarAntes');
btnAgregarAntes.addEventListener('click', agregarAntes);//la funcion

function agregarAntes(){
    let primerElem= document.getElementById('primerElemento'); // ubicar donde trabajar 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "Nueva tarea delante del 1er elemento";
    primerElem.before(nuevoElem);

}

let btnAgregarDespues = document.getElementById('btnAgregarDespues');
btnAgregarDespues.addEventListener('click', agregarDespues);//la funcion

function agregarDespues(){
    let primerElem= document.getElementById('primerElemento'); // ubicar donde trabajar 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "Nueva tarea detras del 1er elemento";
    primerElem.after(nuevoElem);

}

let btnAgregarInicio = document.getElementById('btnAgregarInicio');
btnAgregarInicio.addEventListener('click', agregarInicio);//la funcion

function agregarInicio(){
   
    let primerElem= document.getElementById("listaTareas"); // ubicar donde trabajar, no olvides el # 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "Nueva tarea al inicio.";
    primerElem.prepend(nuevoElem);
}


let btnAgregarFinal = document.getElementById('btnAgregarFinal');
btnAgregarFinal.addEventListener('click', agregarFinal);//la funcion

function agregarFinal(){
    let primerElem= document.getElementById('listaTareas'); // ubicar donde trabajar 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "Nueva tarea al final.";
    primerElem.append(nuevoElem);

}

let btnReemplazarTodos = document.getElementById('btnReemplazarTodos');
btnReemplazarTodos.addEventListener('click', ReemplazarTodos);//la funcion

function ReemplazarTodos(){
    let primerElem= document.getElementById('listaTareas'); // ubicar donde trabajar 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "He remplazado todo por esta tarea";
    nuevoElem.id="primerElemento";
    primerElem.replaceChildren(nuevoElem);
}

let btnReemplazarPrimero = document.getElementById('btnReemplazarPrimero');
btnReemplazarPrimero.addEventListener('click', ReemplazarPrimero);//la funcion

function ReemplazarPrimero(){
    let primerElem= document.getElementById('primerElemento'); // ubicar donde trabajar 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "He remplazado la primera tarea por esta tarea";
    primerElem.replaceWith(nuevoElem);
}


let btnEliminarPrimero = document.getElementById('btnEliminarPrimero');
btnEliminarPrimero.addEventListener('click', EliminarPrimero);//la funcion

function EliminarPrimero(){
    let primerElem= document.getElementById('primerElemento') // ubicar donde trabajar 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "He eliminado la primera tarea por esta tarea";
    primerElem.remove(nuevoElem);
}


let btnReemplazarPrimeroQuery = document.getElementById('btnReemplazarPrimeroQuery');
btnReemplazarPrimeroQuery.addEventListener('click', ReemplazarPrimeroQuery);//la funcion

function ReemplazarPrimeroQuery(){
    let primerElem= document.querySelector('li'); // ubicar donde trabajar 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "He remplazado la primera tarea por esta tarea";
    primerElem.replaceWith(nuevoElem);
}


let btnEliminarPrimeroQuery = document.getElementById('btnEliminarPrimeroQuery');
btnEliminarPrimeroQuery.addEventListener('click', EliminarPrimeroQuery);//la funcion

function EliminarPrimeroQuery(){
    let primerElem= document.querySelector('li') // ubicar donde trabajar 
    
    let nuevoElem = document.createElement('li'); //lo que quiero crear
    nuevoElem.classList.add('tarea');//añade una clase
    nuevoElem.textContent = "He eliminado la primera tarea por esta tarea";
    primerElem.remove(nuevoElem);
}
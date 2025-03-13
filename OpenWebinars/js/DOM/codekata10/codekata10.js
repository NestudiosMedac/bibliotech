console.log("Lavate Carmina");

document.querySelector(".test").addEventListener("click", function (event){
alert("click en el boton");
 
});

// document.addEventListener("contextmenu", function (event){
//     event.preventDefault();//evita que las funciones basicas se ejecuten
//     alert("menu contextual esta intervenido"); //el click derecho deja de fincionar
     
//     });

window.addEventListener("click", function (event){
    console.log("hemos hecho click en la ventana de la web");   
    });
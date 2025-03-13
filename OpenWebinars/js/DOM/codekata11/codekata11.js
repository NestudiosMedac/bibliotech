console.log("Lavate Carmina");

let inputName = document.querySelector(".saluda");
let btnSaludar = document.querySelector(".boton");

btnSaludar.addEventListener("click", function(event){
    if(inputName.value !== ""){
    alert("Hola, "+inputName.value);
    inputName.value = "";
    }
});
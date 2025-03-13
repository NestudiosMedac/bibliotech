document.getElementById('mensaje').addEventListener('input', validarArea);

function validarArea(){
let msj = document.getElementById('mensaje');
let cont = document.getElementById('contador');
let error = document.getElementById('error');

texto = msj.value.trim();
palabras=texto.split(/\s+/);
console.log(palabras);
cont.textContent = palabras.length;

if(palabras ==""){
    cont.textContent=0;
}

if ( palabras.length <= 9 ){
    error.textContent = "El texto tiene minimo 10 palabras" ;
    error.classList.remove('correcto')
    error.classList.add('error');
}else{
    if( palabras.length > 20){
    error.textContent = "El texto tiene maximo 20 palabras" ;
    error.classList.remove('correcto')
    error.classList.add('error');
    }else{
    error.textContent = "✔" ;
    error.classList.remove('error')
    error.classList.add('correcto');
    }
    
}

}

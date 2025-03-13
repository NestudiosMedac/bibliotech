console.log("estoy listo");

let caja1 = document.getElementById('div1');
let caja2 = document.getElementById('div2');
let caja3 = document.getElementById('resultado');
let btnGenera=document.getElementById('btnGenera');
let btnCompara=document.getElementById('btnCompara');
let timer;

btnGenera.addEventListener('click', creoNumerosAleatorios);

function creoNumerosAleatorios(){
    timer = setInterval(function(){
    caja1.textContent=parseInt(Math.random()*50 +1);
    caja2.textContent=parseInt(Math.random()*50 +1);
    }, 1000);
    caja3.textContent="";
    btnCompara.removeAttribute("disabled");
    btnGenera.setAttribute("disabled", "true");
   
}


btnCompara.addEventListener('click', comparoNumerosAleatorios);
function comparoNumerosAleatorios(){
    clearInterval(timer);
    const valor1 =Number(caja1.textContent);//siempre pasar contenido de los textos a int o number, mejor number
    const valor2 = Number(caja2.textContent);
    
    if (valor1 > valor2) {
        caja3.textContent = valor1;
    } else if (valor1 < valor2) {
        caja3.textContent = valor2;
    } else {
        caja3.textContent = "Son iguales";
    };
    
 
    btnGenera.removeAttribute("disabled");
    btnCompara.setAttribute("disabled", "true");
    }
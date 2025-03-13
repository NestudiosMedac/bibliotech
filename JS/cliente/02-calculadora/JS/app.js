//Vamos a realizar una Calculadora.
//Solicitamos numero A, numero B y operación (+,-. * y /)

function recogerNum(mensaje){
    let a = prompt(mensaje);
    while(isNaN(a)){
        a = prompt("Debes introducir un número");
    }
    return(a);
}

function Sumarse(){
    let num1 = recogerNum("Ingrese un numero a");
    let num2 = recogerNum("Ingrese un numero b");
    alert (num1+num2);
}

function Restarse(){
    let num1 = recogerNum("Ingrese un numero a");
    let num2 = recogerNum("Ingrese un numero b");
    alert (num1-num2);
}

function Dividir(){
    let num1 = recogerNum("Ingrese un numero a");
    let num2 = recogerNum("Ingrese un numero b");
    alert (num1 / num2);
}

function Mutiplicar(){
    let num1 = recogerNum("Ingrese un numero a");
    let num2 = recogerNum("Ingrese un numero b");
    alert (num1 * num2);
}
function operacion(mensaje){
    let res = prompt(mensaje);
    switch (res){
        case "+":
            Sumarse();
            break;
        case "-":
            Restarse();
            break;
        case "":
            Mutiplicar();
            break;
        case "/":
            Dividir();
            break;

    }
}

function Calculadora(){

    operacion("Que quieres hacer? sumar = + , restar = - ,Multiplicar = , Dividir = /");
}
//Calculadora();

function SumarVentana(){//boton
    Sumarse();
};

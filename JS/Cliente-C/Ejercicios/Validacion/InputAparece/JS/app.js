console.log("Conectado");

document.getElementById("si").addEventListener('click', esconder);

function esconder() {
    var si = document.getElementById("opcionSi");
    var texto = document.getElementById("texto");

    if (!si.checked) {
        texto.hidden=true;
    } else {
        texto.hidden=false;
    }
  }
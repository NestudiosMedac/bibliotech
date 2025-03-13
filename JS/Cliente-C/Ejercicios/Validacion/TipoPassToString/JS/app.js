console.log("Conectado");

document.getElementById("cambiar").addEventListener('click', cambiar);

function cambiar() {
    var psd = document.getElementById("contra");
    if (psd.type === "password") {
        psd.type = "text";
    } else {
        psd.type = "password";
    }
  }
// opción Generando Nueva tabla
let btnNuevaTabla = document.getElementById('btnNuevaTabla');
btnNuevaTabla.addEventListener('click', creoTabla);

// función para crear la tabla
function creoTabla() {
  let tam;
  do{
    tam = Number(prompt("Dime el tamaño de la nueva tabla a crear"));
  }while(tam > 10 || tam<0 || tam == "");// debo usar || porque && es para que se cumplan AMBOS recuerda!!!!!!!!
    
    let seccionTabla = document.getElementById("incluirTabla");

    let nuevaTabla = document.createElement("table");
    nuevaTabla.classList.add("miTabla");
    nuevaTabla.id = "miTabla";
    let tablaBody = document.createElement("tbody");

    // nuevaTabla.style.width = "100%";
    nuevaTabla.setAttribute("border", 1);
    nuevaTabla.style.width = "300px";
    nuevaTabla.style.height = "300px";

    for (let i = 0; i < tam; i++) {
      let fila = document.createElement("tr");
      for (let j = 0; j < tam; j++) {
        let celda = document.createElement("td");

       
        celda.innerHTML = `${i + 1}`;
        
        // Añadir un manejador de eventos para cambiar el color al hacer click
        // en la celda oportuna.
        celda.onclick = function () {
            cambiaCelda(this);
        };
        fila.appendChild(celda);
        // añado la celda que acabo de crear a la fila que estoy construyendo
      }
      tablaBody.appendChild(fila);
    }
    nuevaTabla.appendChild(tablaBody);
    seccionTabla.appendChild(nuevaTabla);
};
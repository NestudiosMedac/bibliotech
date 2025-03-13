// incluimos y definimos las funciones a exportar

function saludar(name){
    return `Hola, ${name}`;
}

function despedida(name){
    return `Hasta luego, ${name}`; //o "Hasta luego, "+name es mas eficiente la otra
}
// export function despedida(name){// de esta forma ya esta exportada directamente
//     return `Hasta luego, ${name}`; //o "Hasta luego, "+name es mas eficiente la otra
// }

// Exporto las funciones
export{saludar, despedida}; 


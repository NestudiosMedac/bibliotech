// function getCopyright(name, year = 2024){
//     let copyright = name + " - " + year;
//     return copyright;

// }

// let res = getCopyright("OpenWebinars", 2022);

// Funcion anonima

// let res = function(name, year = 2024, formatter){// Callback es llamar a una funcion dentro de otra funcion, es este caso formatter
//          let copyright = formatter(name, year);
//         return copyright;
    
// }

// let formatter = function(name, year){
//          return name + "|" + year;
// }
// console.log(res("Nuria", 2025, formatter)); 

//Funcion autoinvocada

(function(name, year){
        console.log(name, year);
})("Jose de la Junta es un puto traidor", 2025);//los argumentos se colocan al final
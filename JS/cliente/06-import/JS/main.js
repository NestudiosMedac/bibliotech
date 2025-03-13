// importamos
//1. import {saludar, despedida} from "./saludos.js";

import * as miExport from './saludos.js';// Para exportar todos 

// utilizar las funciones
// 1.console.log(saludar('Jose Miguel'));
// 1.console.log(despedida('Jose Miguel'));

console.log(miExport.saludar('Jose Miguel'));
console.log(miExport.despedida('Jose Miguel'));
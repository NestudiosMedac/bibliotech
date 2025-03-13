let html = "<html><body><h1 class=\"h1 font text\"> Formacion tecnica </h1></body></html>";

let expression = new RegExp(/<h1.*class=".*">(?<texto>.*)<\/h1>/);
let res=expression.exec(html);

console.log(res.groups.texto);

let phone = new RegExp(/\+34\s?([0-9]{3})\s?([0-9{3})\s?([0-9]{3})\s?/);

let isValid = phone.exec("+34 601 439 603");
console.log(isValid !== null);
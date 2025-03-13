let namedCollection = ["Nuria","Ari","Gerar", "Mama", "Rebeca"];

console.log(namedCollection);

console.log(namedCollection[0]);

let enumu = new Set([1, true, 7, "Hola"]);//Puedes guardar lo que quieras

console.log(enumu.has(7));// No puedes entrar por posiciones, tienes que preguntar que quieres y nos devuelve un boolean
console.log(enumu);
enumu.add("Adios");
console.log(enumu);

let mapeo = new Map([
    ["1", "Nuria"],
    [2, "Ari"],

]);

mapeo.set("1", "OpenWeb");// hay que tener cuidado con los tipos de las claves porque sino no sobreescribe, añade
console.log(mapeo);
console.log(mapeo.get(2));// tambien se puede poner "1"

let objeto = {
name: "Ari",
surname: "Lopez"
};

console.log(objeto.surname);

let currentDate = new Date ();
let secondCurrentDate = new Date ();
// hay que tener en cuenta donde se coloca (Instancia) porque puede diferir el tiempo


console.log(currentDate);
console.log(secondCurrentDate);

let count = 0;
console.log(++count); // count++ no funcionaria aqui, ** es para exponer



//Condicionales avanzados

let myFruit = "Watermelon";

switch (myFruit){
    case "orange":
    case "lemon":
        console.log("Citric");
        break;
    case "Banana":
        console.log("Tropical");
        break;
    case "Watermelon":
        console.log("Big fruit");
         break;
}

let fruit = "grape";

let avalailableFruits= new Set(["Lemon", "Banana", "Watermelon"]);

let isAvailable = (avalailableFruits.has(fruit))? "available": "no available"; //Ternario

console.log(isAvailable);

let myFavoriteFruit = "orange";
let myFavoriteFruits = {lemon: "Citric", watermelon: "Big fruit", banana: "Tropical", orange: "jus" };

console.log(myFavoriteFruit in myFavoriteFruits);  

let enumeration = [];

for(let i = 0; i < 10; i++) {
    enumeration[i] = i+1;
}

console.log(enumeration);

//do-while, while igual

let fruits = {a:"orange", b:"lemon", c:"grape"};

for(let elem in fruits) {// en objetos, para array se usa of en vez de in
console.log(fruits[elem]); // Como en php echo animales[animal];
}

// break y continue ya los se
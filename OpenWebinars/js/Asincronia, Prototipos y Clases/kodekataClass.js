let inputHtml = 
`<!DOCTYPE html>
<html>
<head></head>
<body>
    <p>Web de viajes</p>
    <div class="product">
        <div class="imagen"><img src="beach.jpg" /></div>
        <div class="content">
            <p class="title">vacaciones en la playa</p>
            <p class="desc">para dos personas con pension completa</p>
            <p class="price">165&euro; por noche/persona</p>
        </div>
    </div>
</body>
</html>`;

class Extractor {
    #value;

    constructor(html, pattern) {
        this.#value = this.#extract(html, pattern);
    }

    get value() {
        return this.#value;
    }

    #extract(html, pattern) {
        // try{
         let capture = pattern.exec(html);
         return capture[1]; 
        // }catch(e){
        //     return "- not found -";

        // }
           }
}

class Product {
    #title;
    #image;

    constructor(title, image) {
        this.#title = title;
        this.#image = image;
    }

    get title() {
        return this.#title;
    }

    get image() {
        return this.#image;
    }
}

// Crear instancias 
try{
    let title = new Extractor(inputHtml, /<p class="title">(.*?)<\/p>/);
    let image = new Extractor(inputHtml, /<img src="(.*?)"/);
    let product = new Product(title.value, image.value);
}catch(e){
    console.log("No hay información completa")
}




console.log(image.value); // beach.jpg
console.log(product);
console.log(product.title); // vacaciones en la playa
console.log(product.image); // beach.jpg

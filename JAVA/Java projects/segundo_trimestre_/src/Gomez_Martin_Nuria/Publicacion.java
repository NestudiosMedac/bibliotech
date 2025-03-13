/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gomez_Martin_Nuria;

/**
 *
 * @author nuria
 */
public class Publicacion {

    private String editorial;
    private String titulo;
    private double precio;

    public Publicacion(String titulo, String editorial, double precio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.precio = precio;

    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {

    }

    public void calcularPrecioFinal(double IVA) {//en el main estaria el calcularPrecioFinal(21).
        this.precio = this.precio + (this.precio * IVA / 100);//he sustituido el dato de la variable precio.

    }

    public String toString() {//método para devolver la información.
        String res = "";
        res += "Publicacion [" + this.editorial + "]#" + this.titulo + "#" + this.precio + "]";
        return res;
    }

}

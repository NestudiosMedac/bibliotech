/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pajaro;

/**
 *
 * @author Nuria
 */
public class Pluma {

    private double ancho;
    private double largo;
    private String color;

    public Pluma(double x, double y, String colour) {
        this.ancho = x;
        this.largo = y;
        this.color = colour;
         while (!(this.color.equalsIgnoreCase("Blanco") || this.color.equalsIgnoreCase("negro") || this.color.equalsIgnoreCase("Amarillo"))) {
            this.color= "Blanco";        }
    }

    @Override
    public String toString() {
        return "P["+this.color+" : "+this.ancho+", "+this.largo+"]";
    }
    
    
}

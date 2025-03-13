/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Composicion;

/**
 *
 * @author nuria
 * Composicion
 */
public class Hoja {
    
    private String color;
    private double anchura;    
    private double altura;
    private double grosor;
    
    public Hoja (String color){
        this.color=color;
        this.anchura=(int)(Math.random()*30+1);
        this.altura=(int)(Math.random()*100+1);
        this.grosor=(int)(Math.random()*5+1);
    }
public Hoja (String color,double anc,double alt, double groso){
    this.grosor=groso;
    this.color=color;
    this.altura=alt;
    this.anchura=anc;
    
    
}

   
    public String toString() {
        return "Hoja("+"color="+color+", anchura"+anchura+", altura"+altura+")";
    }

  
}

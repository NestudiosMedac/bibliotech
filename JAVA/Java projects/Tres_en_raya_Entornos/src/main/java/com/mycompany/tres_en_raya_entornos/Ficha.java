package com.mycompany.tres_en_raya_entornos;

/**
* @autor Aurelio y Nuria
* @version 0.1
*/
public class Ficha {

    private String forma;
    private String color;
    private String tam;
/**
*Constructor de Ficha, genera fichas segun la forma 
* @param forma Marca la forma que tiene la ficha
*/
    public Ficha(String forma) {
        this.forma = forma;
    }
/**
* Metodo que devuelve la forma de la ficha 
* @return la forma
*/
    public String getForma() {
        return forma;
    }
/**
* Metodo que cambia la forma de la ficha 
* @param forma a la que desea cambiar
*/
    public void setForma(String forma) {
        this.forma = forma;
    }
/**
* Metodo que devuelve el color de la ficha 
* @return el color
*/
    public String getColor() {
        return color;
    }
/**
* Metodo que cambia la forma de la ficha 
* @param color  al que desea cambiar
*/
    public void setColor(String color) {
        this.color = color;
    }
/**
* Metodo que devuelve el tamaño de la ficha 
* @return el tamaño
*/
    public String getTam() {
        return tam;
    }
/**
* Metodo que cambia el tamaño de la ficha 
* @param tam  al que desea cambiar
*/
    public void setTam(String tam) {
        this.tam = tam;
    }

    
/**
* Metodo que compara una ficha con otra para saber si son iguales 
* @param obj es la ficha que vamos a introducir
* @return un booleano T/F si son iguales o no
*/
    @Override
    public boolean equals(Object obj) {
    if (obj instanceof Ficha) {
        Ficha otraFicha = (Ficha) obj;
        return forma.equals(otraFicha.forma);
    }
    return false;
}
/**
* Metodo que genera un numero unico asignado a una forma
* 
* @return numero unico
*/
    @Override
    public int hashCode() {
        return forma.hashCode();
    }
}
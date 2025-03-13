/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concesionario;

import java.util.InputMismatchException;

/**
 *
 * @author Nuria
 */
public class Vehiculo {
    private  String matricula;
    private  String marca;
    private  String modelo;
    private  String color;
    private boolean kmt0;//true-km0 ó false nuevo
    private int kmts;

    public Vehiculo(String matricula, String marca, String modelo, String color) {
        this.matricula = matricula;
    if (!comprobarMatricula(matricula)){
        throw new InputMismatchException("Matrícula no valida");
    }
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        if (!comprobarColor(color)) {
            throw new InputMismatchException("Color no valido");
        }
    }
   public Vehiculo(String matricula, String marca, String modelo, String color, int kmts) {
        this.matricula = matricula;
    if (!comprobarMatricula(matricula)){
        throw new InputMismatchException("Matrícula no valida");
    }
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        if (!comprobarColor(color)) {
            throw new InputMismatchException("Color no valido");
        }
        this.kmt0=true;
        this.kmts=kmts;
   
    } 
    public Vehiculo( String marca, String modelo) {
    
        this.marca = marca;
        this.modelo = modelo;
 
      
  
    } 
    
    
     public boolean comprobarMatricula(String matricula){
        return matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$"); //usar patron como en lenguaje de marcas con matches
  }
    
     public boolean comprobarColor(String color){// si es true el color esta bien
        //tamb puedes array
        return color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")
                ||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")
                ||color.equalsIgnoreCase("verde")||color.equalsIgnoreCase("gris")
                ||color.equalsIgnoreCase("amarillo"); //lila    
    }
    public int comprobarKm0(boolean kmt0){
    if (!this.kmt0){
        return 0;

    }else{
        return this.kmts;
    }     
    }
    
    public int pasarKm0(int kmts){//cambia el tipo del coche a KM0 y almacena los kilometros que se le pasan como parámetro
        return kmts;
    }
    
   public String cambiarColor(String nuevoColor){// cambia el color del coche.
   return nuevoColor;
   }
    public boolean actualizarKmts(int kmts){//si el coche es del tipo KM0, este método actualiza los kilómetros, sino, los pone a 0. Devuelve true o false si se consigue actualizar el valor.
    return true;
   }

    public String getMatricula() {
        return matricula;
    }
    @Override//Tester
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", kmt0=" + kmt0 + ", kmts=" + kmts + '}';
    }
   
}

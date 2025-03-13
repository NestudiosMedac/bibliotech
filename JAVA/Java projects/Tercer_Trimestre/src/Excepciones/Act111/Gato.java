/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.Act111;
import java.util.InputMismatchException;
/**
 *
 * @author Nuria
 */
public class Gato {
   private String nombre;
   private int edad;
    
   public Gato(String name, int anios) throws InputMismatchException , ArithmeticException{
   this.nombre=name;
   if(name.length()>=3){
       this.nombre=name;
   }else{
       throw new InputMismatchException("Ponle un buen nombre al michi");
   }
   this.edad=anios;
   if(anios>0){
       this.edad=anios;
   }else{
        throw new ArithmeticException("Edad no posible");
   }
   }

   
   
   
    public void setNombre(String nombre)throws InputMismatchException {
         if(nombre.length()>=3){
       this.nombre=nombre;
   }else{
       throw new InputMismatchException("Ponle un buen nombre al michi");
   }
    }

   
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    
     public void setEdad(int edad)throws ArithmeticException{
         if(edad>0){
       this.edad=edad;
   }else{
        throw new ArithmeticException("Edad no posible");
   }
   
    }


    @Override
    public String toString() {
        return "El gatito " + nombre + " tiene " + edad + "anios de edad.";
    }
   
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gomez_Nuria;

/**
 *
 * @author nuria
 */
public class Tecnica {//arreglar boolean
   private String nombre;
   private double ki;
   private int nivel;//1, 2 o 3 aleatorio
   private boolean tipo;//T-ataque,F-defensa

    public Tecnica(String nom, double ky) {//(int)(Math.random()*(max-min+1)+min)
        this.nombre = nom;
        this.ki = ky;
        
        this.nivel=(int)(Math.random()*(3)+1);
        //boolean?
    }
   private String tipoTecnica(){
       this.tipo=true;
   if(!this.tipo){
       return "defensa";
   }else{
       return "ataque";
   }
   }
    public double calcularEfecto(int valor){
      double efecto=(valor/this.nivel)*0.85;
      return efecto;
    }

    @Override
    public String toString() {
        return this.nombre+"["+tipoTecnica()+", "+this.ki+"] "+this.nivel;
    }
    
    
   
}

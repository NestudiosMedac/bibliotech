/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gomez_Nuria;

/**
 *
 * @author nuria
 */
public abstract class Humano extends Ser{

    public Humano(String name, int edad) {
        super(name, edad);
        this.vida=super.vida;
    }
//no es necesario ponerlos pero ayudan a no olvidarlos
    //@Override
    //public abstract String hablar();

    //@Override
   // public abstract void entrenar();

    @Override
    public String toString() {
        return "Humano ["+this.getNombre()+", "+this.getEdad()+", "+this.vida+"]";
    }
    
    
}

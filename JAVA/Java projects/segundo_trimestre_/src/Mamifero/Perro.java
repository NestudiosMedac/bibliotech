/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mamifero;

/**
 *
 * @author nuria
 */
public class Perro extends Mamifero{
    String raza;
    String nombre;
    
    public Perro (String name, String racer, double peso, int np, int vm){
        super(np, peso, vm);
        this.raza=racer;
        this.nombre=name;
    }
    
    @Override
    public void comunicarse(){
        System.out.println("Guau");
    }
    
    
    @Override
    public String toString() {
        return "Perro{"+super.toString()+ ", raza=" + raza + ", nombre=" + nombre + '}';
    }
}

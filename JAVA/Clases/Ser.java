/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gomez_Nuria;

/**
 *
 * @author nuria
 */
public abstract class Ser {//perdon por la falta de compentarios

    private String nombre;
    private int edad;
    protected int universo;
    protected int vida, ataque, defensa, ki;
    protected int nivel;
 

    public Ser(String name, int edad) {
        this.nombre = name;
        this.edad=edad;
        this.universo = 6;
        this.vida = 100;
        this.ki = 1;
        this.nivel=1;
       
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }





  

    public abstract String hablar();
    public abstract void entrenar();
 

    @Override
    public String toString() {
        return "Ser del universo 6 [" + this.nombre + ", " + this.edad + ", "
                + this.ataque + ", " + this.defensa + ", " + this.vida + ", "
                + this.ki + "]";
    }

}

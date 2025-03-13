/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MedacGames;

/**
 *
 * @author Nuria
 */
public abstract class Heroe {
    String nombre;
    int inteligencia;
    int fuerza;
    boolean muerto;//T-muerto, F-vivo
    int destreza;
    int vida;

    public Heroe(String name) {
        this.nombre = name;
        this.inteligencia=0;
        this.fuerza=0;
        this.muerto=false;
        this.destreza=0;
        this.vida=0;
       
    }
    
    public abstract void atacar(Heroe defensor);
    public abstract boolean esquivar();
    
}

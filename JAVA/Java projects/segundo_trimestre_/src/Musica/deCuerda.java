/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musica;

/**
 *
 * @author nuria
 */
public abstract class deCuerda extends Instrumento{
    int nCuerdas;
    boolean tipo;//T-pulsada F-percutida

    public deCuerda(int nCuerdas, boolean tipo, String marca, String fecha, Partitura partiture) {
        super(marca, fecha, partiture);
        this.nCuerdas = nCuerdas;
        this.tipo = tipo;
    }

    public deCuerda(int nCuerdas, boolean tipo, String marca, String fecha) {
        super(marca, fecha);
        this.nCuerdas = nCuerdas;
        this.tipo = tipo;
    }
    
    
//public abstract String tocarPartitura();
//public abstract void afinar();
    
}

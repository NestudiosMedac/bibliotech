/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mamifero;

/**
 *
 * @author nuria
 */
public abstract class Mamifero {
    int numpatas;
    double peso;
    int vidamedia;

    public Mamifero(int np, double peso, int vm) {
        this.numpatas = np;
        this.peso = peso;
        this.vidamedia = vm;
    }
    public abstract void comunicarse();
    
    
    @Override
    public String toString() {
        return "Mamifero{" + "numpatas=" + numpatas + ", peso=" + peso + ", vidamedia=" + vidamedia + '}';
    }
    
    
    
    
}

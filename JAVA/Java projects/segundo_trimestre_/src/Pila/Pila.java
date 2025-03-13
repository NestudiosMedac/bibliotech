/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

/**
 *
 * @author nuria
 */
/*public class Pila {

    private int pila[];
    private int indice;

    public Pila(int tam) {
        this.pila = new int[tam];
        this.indice = -1;
    }

    public void insertar(int elemento) {//añade un elemento al array

        if (this.indice < this.pila.length) {
            this.indice++;
            this.pila[this.indice] = elemento;
        } else {
            System.out.println("Pila llena. No puedo meter mas elementos");
        }
    }

    public int cima() {// muestra la cima de la pila
        return this.pila[this.indice];
    }

    public int extraer() {//saca el ultimo elemento de la pila
        if (vacia() == false) {
            int tmp = this.pila[this.indice];
            this.pila[this.indice] = 0;
            this.indice--;
            return tmp;
        } else {
            System.out.print("");

        }

    }

    public boolean vacia() {//muestra si la pila esta vacia
        //return this.indice==-1
        boolean vacia = true;
        if (this.indice >= 0) {
            return false;
        }
        return vacia;
    }

    public boolean llena(int tam) {//muestra si la pila esta llena
        //return this.indice==this.pila.lenght-1
        boolean llena = false;
        if (this.indice == pila.length - 1) {
            return true;
        }
        return llena;
    }

    public String toString() {//método para devolver la información.
        String res = "";
        res += "El estado del indice es:" + this.indice + "\n";
        res += "Los valotes de la pila son:";
        for (int i = this.pila.length - 1; i >= 0; i--) {
            res += this.pila[this.indice] + "\n";
        }
        return res;
    }
}
*/
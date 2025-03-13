/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cielo;

/**
 *
 * @author nuria
 */
public class estrella {//estrella estaba correcto, pero he copiado la de jaime, tambien puedes meter el math en el constructor como antes

    int x, y;//private
    private char forma;//gracias manuva
//1 estrella cerca = 3 lejos

    public estrella(int fila, int columna) {
        this.x = fila;
        this.y = columna;

        this.forma = this.generarForma();
    }

    public char generarForma() {//sin alterar la funcionalidad de la clase no pasa nada
        char res = '*';
        if ((int) (Math.random() * 3 + 1) <= 2) {
            res = '.';
        }
        return res;
    }

    public String toString() {
        String res = "*";//candidato
       if(this.forma=='.'){//comillas simples si
           res=".";
       }
        return res;
    }

}

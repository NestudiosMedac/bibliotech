/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

/**
 *
 * @author Nuria 50.- Crea un array de 100 elementos dónde cada elemento sea un
 * número aleatorio entre 1 y 100. A continuación muestra por pantalla el mayor
 * y el menor elemento de ese array.
 */
public class act50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[] = new int[100];
        int max = lista[0];
        int min = lista[0];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() *(100 + 1));//cuidado parentesis
            System.out.print(lista[i] + " ");
            if (lista[i] > max) {
                max = lista[i];
            }
            if (lista[i] < min) {
                min = lista[i];
            }

        }
        System.out.println(" ");
        System.out.print("El mayor es " + max + " y el menor es " + min + ". UwU#");
    }

}

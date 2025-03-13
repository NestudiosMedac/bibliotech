/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

/**
 *
 * @author Nuria 51.- Crea un array de 100 elementos dónde cada elemento sea un
 * número aleatorio entre 1 y 100. Realiza los siguientes apartados:
 *
 * a) Haz un programa que muestre los valores múltiplos de 5.
 *
 * b) Otro que sólo muestre los números pares.
 *
 * c) Otro que muestre el mayor de todos los elementos del array y su posición
 * (si hay varios iguales, muestra el primero)
 *
 */
public class act51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int lista[] = new int[100];
        int max = lista[0];
        int pos = 0;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * (100 + 1));//cuidado parentesis
            /*a*//* if (lista[i]%5==0){
            System.out.print(lista[i] + " ");
            }*/
 /*b*//* if (lista[i]%2==0){
            System.out.print(lista[i] + " ");
            }*/

 /*c*/ if (lista[i] > max) {
                max = lista[i];
                pos = i;

            }
            System.out.print(lista[i] + " ");

        }
        System.out.println(" ");
        System.out.println("El mayor es " + max + " y la posicion es " + (pos + 1));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

/**
 *
 * @author Nuria
 * 48.- Sea el array relleno con las notas: 6,3,9,7,5,8,10,2,4 y 5
 * Crea un programa que, a partir de ese array, muestre por pantalla la media
 * aritmética de las notas.
 */
public class act48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] notas = {6, 3, 9, 7, 5, 8, 10, 2, 4, 5};
         double suma=0;
         double media;
         for (int i = 0; i < notas.length; i++) {
             suma+=notas[i];
        }
         media=suma/9;
        System.out.println("La media es "+media);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 16. Se necesita un algoritmo que calcule la media de de tres
 * notas introducidas por teclado y en caso de que esa media sea superior a 6.5,
 * se muestre por pantalla ‘Promocionado con una media de XX’. En caso
 * contrario, mostrar ‘No promocionas’.
 */
public class act16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.err.println("Introduzce 3 notas");
        double nota1 = teclado.nextInt();
        double nota2 = teclado.nextInt();
        double nota3 = teclado.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media > 6.5) {
            System.out.println("Promocionado con una media de " + media + ".");
        } else {
            System.out.println("No promocionas.");
        }
        teclado.close();
    }

}

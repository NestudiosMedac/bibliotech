/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 9. Crea un algoritmo que sirva para resolver ecuaciones de
 * primer grado del tipo: ax+b=0 Vamos a suponer que a y b no van a ser cero
 * nunca.
 */
public class act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.err.println("Introduzca a y b (no pueden ser 0): ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int calculo = (0 - b) / a;

        System.out.println("La X es : " + calculo);
        teclado.close();
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 59.- Realizar un programa que pida al usuario un numero N entre
 * 3 y 5 y, a continuación, cree una matriz NxN (N filas, N columnas) cuyos
 * elementos se le van a ir pidiendo al usuario
 */
public class act59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero:");
        int n = teclado.nextInt();

        while (n > 0) {
            if (n > 3 && n < 5) {
                System.out.println("Introduzca un elemento:");
                int x[] = new int[n];
                System.out.println("Introduzca un elemento: ");
            } else {
                System.out.println("Introduce un numero valido");
                n = teclado.nextInt();
            }
        }
    }
}

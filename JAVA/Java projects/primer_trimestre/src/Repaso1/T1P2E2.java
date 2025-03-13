/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class T1P2E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entre 5 y 10(pulsa 0 para salir): ");
        int num = teclado.nextInt();
        int maqui;
        int min = 5;
        int max = 10;

        if (num == 0) {
            System.out.println("GameOver");
        } else {
            while ((num < min) || (num > max)) {
                System.out.println("Por favor que sea entre 5 y 10: ");
                num = teclado.nextInt();

            }
            while ((num >= min) || (num <= max)) {
                maqui = (int) (Math.random() * (20 - 1 + 1) + 1);
                System.out.println("La maquina ha sacado: " + maqui);

                int contadormaq = 0;
                int contadorusu = 0;
                if (maqui > num) {
                    System.out.println("La maquina ha ganado");
                    contadormaq++;
                } else {
                    System.out.println("Has ganado");
                    contadorusu++;

                }
                System.out.println("Victorias Maquina: " + contadormaq);
                System.out.println("Victorias Jugador: " + contadorusu);
                num = teclado.nextInt();
                
            }
        }
    }
}

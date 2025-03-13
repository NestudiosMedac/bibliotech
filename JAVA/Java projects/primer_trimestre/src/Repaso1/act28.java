/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 28. Realiza un programa que dada una cantidad de dinero en
 * Euros, realice un desglose en billetes y monedas. Ej: Introduce cantidad a
 * desglosar: 434 El desglose obtenido es...
 *
 * 2 billetes de 200€ 1 billete de 20€ 1 billete de 10€ 2 monedas de 2€
 *
 * Los billetes disponibles son de 500,200,10,50,20,10 y 5€ y las monedas de 2 y
 * 1€.
 */
public class act28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la cantidad a desglosar: ");
        int dinero = teclado.nextInt();
        System.out.println("El desglose obtenido es: ");

        if (dinero >= 500) {
            int bil500 = dinero / 500;
            System.out.println(bil500 + " billetes de 500 euros ");
            dinero = dinero % 500;
        }
        if (dinero >= 200) {
            int bil200 = dinero / 200;
            System.out.println(bil200 + " billetes de 200 euros ");
            dinero = dinero % 200;
        }
        if (dinero >= 20) {
            int bil20 = dinero / 20;
            System.out.println(bil20 + " billetes de 20 euros ");
            dinero = dinero % 20;
        }
        if (dinero >= 10) {
            int bil10 = dinero / 10;
            System.out.println(bil10 + " billetes de 10 euros ");
            dinero = dinero % 10;
        }
        if (dinero >= 5) {
            int bil5 = dinero / 5;
            System.out.println(bil5 + " billetes de 5 euros ");
            dinero = dinero % 5;
        }

        if (dinero >= 2) {
            int mone2 = dinero / 2;
            System.out.println(mone2 + " monedas de 2 euros ");
            dinero = dinero % 2;
        }
        if (dinero >= 1) {
            int mone1 = dinero / 1;
            System.out.println(mone1 + " monedas de 1 euros ");

        }
        teclado.close();
    } 
}

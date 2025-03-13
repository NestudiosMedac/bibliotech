/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 25. Realiza un programa que indique si un numero introducido
 * por teclado es de 5 cifras y además es par.
 */
public class act25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero de 5 cifras: ");
        double num = teclado.nextInt();
        double grande=99999; //cuidado con los puntos que creas decimales.
        double peque=10000;
        
        if (num>=peque && grande>=num) {
            
            if (num % 2 == 0) {
                System.out.println("Es par y tiene 5 cifras.");

            } else {
                System.out.println("Es impar y tiene 5 cifras.");
            }
            
        } else{
            System.out.println("Mete un numero de 5 cifras porfavo.");
        }
        teclado.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

/**
 *
 * @author nuria
 */
public class T1P2E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int op9;
        int op5;
        int inicio = 100;
        int ultimo = 300;

        for (int d = inicio; d >= ultimo; d++) {
            op9 = 9 % d;
            op5 = 5 % d;
            if (op9>=0) {
                System.out.println("El numero " + d + " es multiplo de 9.");
            } else if (op5==0) {
                System.out.println("El numero " + d + " es multiplo de 5.");
                System.out.println("Además el numero " + d + " es multiplo de 15.");
            }
        }
    }
}

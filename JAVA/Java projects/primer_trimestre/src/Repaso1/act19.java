/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 19. Diseña un algoritmo que calcule el mayor de 5 números
 * introducidos por el usuario. Utiliza la versión de el “candidato” para
 * resolverlo. Hay que controlar además, que los valores de introducidos sean
 * correctos: números positivos
 */
public class act19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.err.println("Introduce 5 numeros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int d = teclado.nextInt();
        int e = teclado.nextInt();
        int mayor = a;

        if (a > 0) {
            mayor = a;
        }
        if (b > mayor && b > 0) {
            mayor = b;

        }
        if (c > mayor && c > 0) {
            mayor = c;

        }
        if (d > mayor && d > 0) {
            mayor = d;
        }
        if (e > mayor && e > 0) {
            mayor = e;
            System.out.println("El mayor es " + mayor);
        } else {
            System.out.println("ERROR.");
        }
        teclado.close();
    }

}

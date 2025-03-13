/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 35. Implementa un programa que solicite al usuario dos números:
 * n y m. A continuación debe mostrar todos los múltiplos de n, entre n y m*n.
 * Ejemplo: Introduce primer número: 4 Introduce segundo número: 10 Los
 * múltiplos de 4 entre 4 y 40 son: 8,12,16,20,24,28,32,36,40
 */
public class act35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca n y m:");
        System.out.print("n: ");
        int n = teclado.nextInt();
        System.out.print("m: ");
        int m = teclado.nextInt();
        int op;
        String res = "";

        for (int d = 0; d <= n * m; d++) {//aqui obligamos que el tope sea el 40
            if (d * n < n * m) {// el d por el 4 sea menor siempre que el 40
                op = (d * n);
                res += op + ",";
            } else if (d * n == n * m) {
                op = (d * n);
                res += op + ".";
            }
            teclado.close();
        }
        System.out.println("Los multiplos entre " + n + " y " + m * n + " son: " + res);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 4. Diseña un algoritmo que pida dos números por teclado (m y n)
 * y calcule las siguientes expresiones: a) m / n*(m-n) b) 12.3 / m + 5 - n * 9
 * c) m * 2048 / n*1024 - mn d) El resto de la división: (3203 /m-n)n / (n2*m3)
 */
public class act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.err.println("Introduce el numero m: ");//con err sale en rojo
        int m = teclado.nextInt();
        System.err.println("Introduce el numero n: ");//con err sale en rojo
        int n = teclado.nextInt();

        int a = m / n * (m - n);
        double b = 12.3 / m + 5 - n * 9;
        int c = m * 2048 / n * 1024 - m * n;
        int division1 = (3203 / m - n);
        double elevardivision = Math.pow(division1, n);
        double elevarn = Math.pow(n, 2);
        double elevarm = Math.pow(m, 3);
        double d = division1 % (elevarn * elevarm);

        System.out.println("a) es igual a: " + a);
        System.out.println("b) es igual a: " + b);
        System.out.println("c) es igual a: " + c);
        System.out.println("El resto de la division d es igual a : " + d);
        teclado.close();
    }

}

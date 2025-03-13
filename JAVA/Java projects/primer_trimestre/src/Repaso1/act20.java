/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 20. Se pide realizar un algoritmo que solicite por teclado tres
 * números. Si todos los valores ingresados son menores a 0, se mostrará por
 * pantalla: Los números son: números introducidos El mayor es: el número mayor
 * El menor es: el número menor
 */
public class act20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.err.println("Introduce 3 numeros: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int mayor = a;
        int menor = b;

        if (-1 > a ) {
            mayor = a;
        }
        if (-1 > b && b > mayor) {
            mayor = b;
        }
        if (-1 > c && c > mayor) {
            mayor = c;

            System.out.println("Los numeros introducidos son: " + a + " " + b + " " + c);
            System.out.println("El mayor es: " + mayor);
        }
        if (-1 > b ) {
            menor = b;

        }
        if (-1 > a && a < menor) {
            menor = a;
        }
        if (-1 > c && c < menor) {
            menor = c;
            System.out.println("El menor es: " + menor);

        } else {
            System.err.println("Tiene que ser un numero negativo");
        }

    }

}

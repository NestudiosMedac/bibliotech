/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 18. Realizar un algoritmo que pida por teclado dos números. Si
 * el primero es mayor al segundo, mostrar la resta y la división de ambos. Si
 * el segundo es mayor o igual al primero, mostrar la suma y el producto de
 * ambos.
 *
 */
public class act18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.err.println("Introduce el a y b: ");
        int a = teclado.nextInt();
        int b = teclado.nextInt();

        if (a > b) {
            System.out.println("La resta es " + (a - b) + " y la division es " + (a / b));
        } else if (b >= a) {
            System.out.println("La suma es " + (a + b) + " y el producto es " + (a * b));
        }
        teclado.close();
    }

}

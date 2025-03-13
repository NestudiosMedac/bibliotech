/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author Nuria
 * 36. Desarrolla un algoritmo que pida 5 elementos por teclado y
 * continuación muestre la suma de todos los elementos, la suma de aquellos
 * números mayores a 36 y la suma de aquellos números menores a 10. Nota: no
 * puedes usar 5 variables.
 */
public class act36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int suma = 0;
        int suma2 = 0;
        int suma3 = 0;
//tienen que ser o todos mayores o menores xd
        for (int i = 1; i <= 5; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce cinco numeros: ");
            num = teclado.nextInt();
            suma += num;
            if (i == 5) {

                System.out.println("La suma de todos es: " + suma);
            }
            suma2 += num;
            if (i == 5 && num > 36) {

                System.out.println("La suma de los mayores de 36 es: " + suma2);
            }
            suma3 += num;
            if (i == 5 && num < 10) {

                System.out.println("La suma de los menores de 10 es: " + suma3);
            }
        }
    }

}

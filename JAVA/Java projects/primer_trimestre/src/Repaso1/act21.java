/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 21. Realiza un algoritmo que indique si un año es bisiesto o
 * no. Un año es bisiesto si es divisible entre 4 y no es divisible entre 100 o
 * es divisible entre 400
 */
public class act21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un year: ");
        int year = teclado.nextInt();

        int bisiesto = year % 4;
        int nobisiesto = year % 100;

        if (bisiesto == 0 && nobisiesto != 0) {
            System.out.println("El year es bisiesto");
        } else {
            System.out.println("El year no es bisiesto");

        }
        teclado.close();
    }

}

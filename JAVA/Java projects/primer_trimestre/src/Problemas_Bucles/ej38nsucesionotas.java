/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problemas_Bucles;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class ej38nsucesionotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num;
        int suma = 0;
        int contador = 0;
       
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Dame un numero: ");
            num = teclado.nextInt();
            if (num >= 0 && num <= 10) {
                contador++;
                suma += num;
            } else if (num == -1) {
                System.out.println("Fin");
            } else {
                System.out.println("ERROR");
            }
        } while (num != -1);
        System.out.println("La media es: " + suma / contador);

    }
}

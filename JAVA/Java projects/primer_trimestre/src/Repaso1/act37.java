/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author Nuria 37. Escribe un algoritmo que pida una lista de números enteros
 * uno a uno hasta que se introduzca el valor 0. A continuación debe escribir
 * por pantalla la posición de la primera y de la última aparición del número 12
 * dentro de la lista. Ejemplo:
 */
public class act37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int conta = 0;
        int primera = -1;
        int ultima = -1;
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Dame un numero: ");
            num = teclado.nextInt();

             if (num == 12) {
                if (primera == -1) {
                    primera = conta;
                }
                ultima = conta;
            
            }
            conta++;

        } while (num > 0);
        System.out.println("Primera aparicion en posicion " + (1+primera));
        System.out.println("Ultima aparicion en posicion " + (1+ultima));

    }
}

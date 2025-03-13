/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 17. Solicitar que el usuario introduzca una clave dos veces.
 * Mostrar un mensaje indicando si las claves son iguales o si son diferentes
 */
public class act17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.err.println("Introduce la clave dos veces: ");
        int pswd = teclado.nextInt();
        int pswd2 = teclado.nextInt();

        if (pswd == pswd2) {
            System.out.println("Estan correctas. Cargando...");
        } else {
            System.out.println("ERROR.");
        }
        teclado.close();
    }

}

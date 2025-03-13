/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class Excepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0, tam = 0;
        int i = 0;
        boolean salir = false;
        Scanner entrada = new Scanner(System.in);
        int lista[] = null;
        do {
            try {
                System.out.print("Introduce un tamanio: ");
                tam = entrada.nextInt();
                lista = new int[tam];
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "=error porque has metido una palabra");
                entrada.nextLine();
            } catch (NegativeArraySizeException e) {
                System.out.println(e.getMessage() + "=error porque has metido un num negativo");
            }

        } while (!salir);

        for (i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * 3);
            System.out.println("He metido un " + lista[i]);
        }
        System.out.println("");

        for (i = 1; i < lista.length; i++) {

            try {
                suma += (lista[i] / lista[i - 1]);
            } catch (ArithmeticException e) {
                suma += 0;
            }
        }
        System.out.println("Suma es: " + suma);
    }

}

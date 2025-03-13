/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class Act106 {

    /**
     * 106.- Desarrolla el juego ‘Adivina el número’ pero controlando que se
     * introducen números. Recordatorio de las reglas: El ordenador debe generar
     * un número entre 1 y 100, y el usuario tiene que intentar adivinarlo. Para
     * ello, cada vez que el usuario introduce un valor, el ordenador debe
     * decirle al usuario si el número introducido es mayor o menor que el
     * pensado. Cuando consiga adivinarlo, debe indicarlo e imprimir en pantalla
     * el número de veces que el usuario ha intentado adivinar el número
     *
     * @param args
     */
    public static void main(String[] args) {
        int num_adivina = (int) (Math.random() * (100 - 1 + 1) + 1);
        int contador = 0;
        int num_usu;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        do {
            try {
                System.out.println("Dime el numero en el que estoy pensando...");
                contador++;
                num_usu = teclado.nextInt();
                salir = true;
                if (num_usu > num_adivina) {
                    System.out.println("Te has pasado...");
                    salir=false;
                } else if (num_usu < num_adivina) {
                    System.out.println("Te has quedado corto...");
                    salir=false;
                } else {
                    System.out.println("Felicidades! solo has tenido que intentarlo " + contador + " veces");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enserio acabas de meter una palabra?");
                contador++;
                teclado.nextLine();
            }
            finally{
                teclado.close();
            }
        } while (!salir );

    }

}

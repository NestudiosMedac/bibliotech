/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 6. Crea un algoritmo que, partiendo de la cadena “LA LLUVIA EN
 * SEVILLA ES UNA MARAVILLA” obtenga las cadenas “sevilla es una maravilla” y
 * “la lluvia es una maravilla”. Muestra ambas por pantalla
 */
public class act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena'LA LLUVIA EN SEVILLA ES UNA MARAVILLA'.");
        String frase = teclado.next();

        System.out.println(frase.length());

    }

}

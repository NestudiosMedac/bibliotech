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
public class ej46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pensado = (int) (Math.random() * (100 - 1 + 1) + 1);
        //System.out.println(""+pensado);//para comprobar
        Scanner teclado = new Scanner(System.in);
        System.out.println("he pensado un numero...Dime tu jugada");
        int jugada = teclado.nextInt();

        while (jugada != pensado) {
            if (jugada > pensado) {
                System.out.println("te has pasaooo");
            } else if (jugada < pensado) {
                System.out.println("te has quedado corto");
            }
            System.out.println("dime otro numero");
            jugada = teclado.nextInt();
        }
        System.out.println("Has ganao");
    }
}

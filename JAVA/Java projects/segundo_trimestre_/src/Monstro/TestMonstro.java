/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Monstro;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class TestMonstro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre del monstro:");
        String nombre = teclado.next();
        Monstro random = new Monstro(nombre);
        int a;
        int b;
        
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1-Comer.\n2-Comunicarse.\n3-Jugar.\n4-Mimir.\n0-Fin.");
            a = teclado.nextInt();

            if (a != 0) {
                switch (a) {
                   case 1 -> {
                        System.out.println("Que quieres hacer?(obligatorio seleccionar)");
                        System.out.println("1-Comida normal.\n2-Comida favorita.");
                        b = teclado.nextInt();
                        switch (b) {
                            case 1->
                                random.comer(b);
                            case 2->
                               random.comer(b);
                            default->
                            { System.out.println("Introduzca uno de los numeros del menu.");}
                        }
                    }
                    case 2 ->random.comunicarse();
                    case 3 -> random.jugar();
                    case 4 ->random.dormir();
                    default ->
                        System.out.println("Introduzca uno de los numeros del menu.");
                }
            }
        } while (a > 0);
    }
   
    
}

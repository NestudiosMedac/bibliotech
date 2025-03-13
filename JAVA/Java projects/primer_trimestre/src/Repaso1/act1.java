/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria
 * 1. Crea un algoritmo que pida al usuario su nombre, su DNI y fecha de nacimiento y a
continuación muestre esa información por pantalla de manera ordenada. Pej: Si el
usuario se llama Juan, su DNI es 56789123D y nació el 23/02/1998 se mostrará:
 */
public class act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String nombre=teclado.next();
        System.out.println("Introduce tu DNI: ");
        String dni=teclado.next();
        System.out.println("Introduce tu fecha de nacimiento: ");
        String fecha= teclado.next();
        
        System.out.println("Nombre...............: "+nombre);
        System.out.println("Dni..................: "+dni);
        System.out.println("Fecha de nacimiento..: "+fecha);
        teclado.close();
            }
}

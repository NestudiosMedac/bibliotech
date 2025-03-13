/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author Nuria 52.- Crea un array de tamaño 10 que sirva para almacenar
 * colores y pide al usuario que rellene cada posición del array con un color. A
 * continuación indica cuantas veces aparece el color “rojo” y el color “azul”
 * usando la siguiente salida:
 *
 * El color 'rojo' aparece X veces en el array. El color 'azul' aparece Y veces
 * en el array.
 *
 * Siendo X el número de veces que aparece el rojo en el array e Y el número de
 * veces que aparece el azul en el array).
 */
public class act52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lista[] = new String[10];
        int x=0;
        int y=0;
        for (int i = 0; i <10; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Ingrese el color para la posicion " +(i+1)+": ");
            lista[i] = teclado.next();
            
            if ("azul".equals(lista[i])){
                y++;
            }
            if ("rojo".equals(lista[i])){
                x++;
            }
        }
        System.out.println("El color 'rojo' aparece "+x+" veces en el Array.");
        System.out.println("El color 'azul' aparece "+y+" veces en el Array.");
    } 
}

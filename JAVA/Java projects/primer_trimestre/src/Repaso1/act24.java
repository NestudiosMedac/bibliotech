/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 24. Pregunta el nombre de dos jugadores. A continuación, simula
 * una partida de tirada de dados: el primer jugador tira un dado de 6 caras y
 * saca una puntuación. Luego hace lo mismo el segundo jugador. Al final se
 * indica que jugador ha ganado
 */
public class act24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el nombre del jugador 1: ");
        String name1 = teclado.next();
        System.out.println("Dime el nombre del jugador 2: ");
        String name2 = teclado.next();

        int tiraname1 = (int) (Math.random() * (6 - 0 + 1) + 0);
        System.out.println(name1 + " ha sacado un " + tiraname1);
        int tiraname2 = (int) (Math.random() * (6 - 0 + 1) + 0);
        System.out.println(name2 + " ha sacado un " + tiraname2);

        if (tiraname1 > tiraname2) {
            System.out.println("El ganador es: " + name1);
        } else if (tiraname1 < tiraname2) {
            System.out.println("El ganador es: " + name2);
        } else {
            System.out.println("Empate");
        }
        teclado.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;
import java.util.Scanner;

/**
 *
 * @author Nuria
 * 59.- Realizar un programa que pida al usuario un numero N entre 3 y 5 y, a
 * continuación, cree una matriz NxN (N filas, N columnas) cuyos elementos se le van a ir
 * pidiendo al usuario.
 */
public class act59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        int N;

        // Pedir al usuario un número entre 3 y 5
        do {
            System.out.print("Ingrese un número entre 3 y 5 para N: ");
            N = teclado.nextInt();
        } while (N < 3 || N > 5);

        // Crear la matriz NxN e ingresar los elementos
        int[][] matriz = new int[N][N];

        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                System.out.print("Ingrese el elemento en la posición (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Mostrar la matriz
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

       
  

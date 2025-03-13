/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;
import java.util.Scanner;
/**
 *
 * @author Nuria
 */
public class actmatrizhelp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // A - Pedir al usuario el tamaño de la matriz
        int N;
        do {
            System.out.print("Ingrese el tamaño de la matriz (entre 3 y 5): ");
            N = scanner.nextInt();
        } while (N < 3 || N > 5);

        // B - Rellenar la matriz con números aleatorios entre 2 y 18
        int[][] matrizOriginal = new int[N][N];
        Random random = new Random();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                matrizOriginal[i][j] = random.nextInt(17) + 2; // Números entre 2 y 18
            }
        }

        // C - Cambiar los números menores a 10 por 0
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (matrizOriginal[i][j] < 10) {
                    matrizOriginal[i][j] = 0;
                }
            }
        }

        // D - Crear una copia de la matriz original
        int[][] copia = new int[N][N];
        for (int i = 0; i < N; ++i) {
            System.arraycopy(matrizOriginal[i], 0, copia[i], 0, N);
        }

        // E - Pedir al usuario la fila a cambiar
        System.out.print("Ingrese la fila a cambiar (de 1 a " + N + "): ");
        int fila = scanner.nextInt();

        // F - Cambiar el número en la fila original y en la copia
        System.out.print("Ingrese el nuevo número para la fila " + fila + ": ");
        int nuevoNumero = scanner.nextInt();

        // Verificar que la fila ingresada esté dentro del rango
        if (fila >= 1 && fila <= N) {
            for (int j = 0; j < N; ++j) {
                matrizOriginal[fila - 1][j] = nuevoNumero;
                copia[fila - 1][j] = nuevoNumero;
            }

            // Mostrar la matriz original y la copia
            System.out.println("\nMatriz Original:");
            mostrarMatriz(matrizOriginal);

            System.out.println("\nCopia con Cambios:");
            mostrarMatriz(copia);
        } else {
            System.out.println("La fila ingresada está fuera de rango.");
        }
    }

    // Método para mostrar una matriz en la consola
    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gomez_Nuria;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class T3P1E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2-.Creamos los flujos de lectura
        String ruta = "src/Gomez_Nuria/numerosB.txt";
        Scanner teclado = new Scanner(System.in);
                
        try (BufferedWriter miBuffer = new BufferedWriter(new FileWriter(ruta, true))) {
            int L = 0;
            int N = 0;
            boolean fuera = false;
            int num;
            String numS;

         
                do {
                    try {
                        System.out.println(" Numero de líneas del fichero:");
                        L = teclado.nextInt();
                        System.out.println("Cantidad de números por linea:");
                        N = teclado.nextInt();
                        if (N < 2 || L < 2) {
                            throw new ArithmeticException("Valores mayores a 2!!");
                        }
                        fuera = true;
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: debes introducir un número!!");
                        teclado.nextInt();

                    }
                } while (!fuera);
                if (ruta.isEmpty()) {
                    miBuffer.write("");
                    System.out.println("Archivo de texto numerosB creado en la carpeta Gomez_Nuria.");

                }
                for (int j = 0; j < L; j++) {
                    for (int i = 0; i <N; i++) {
                        num = (int) (Math.random() * (200 - 30 + 1) + 30);
                        numS = Integer.toString(num);//pasa numeros de tipo integer(asume automaticamente int)a String
                        if (i != N) {
                            miBuffer.write(numS + ".");
                        } else {
                            miBuffer.write(numS + "");
                        }
                        
                    }
                    miBuffer.newLine();
                }
                miBuffer.close();
          

        } catch (IOException e) {
            System.out.println("Posible ERROR: ");
            System.out.println("Falla el FileWriter (abriendo fichero)");

        }
    }

}

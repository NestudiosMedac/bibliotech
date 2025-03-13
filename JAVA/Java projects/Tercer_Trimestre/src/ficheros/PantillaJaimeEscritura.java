/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class PantillaJaimeEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String ruta = "src/ficheros/datos/Ed113.dat";
        Scanner teclado = new Scanner(System.in);
        BufferedWriter miBuffer=null;
      
        try  {
miBuffer = new BufferedWriter(new FileWriter(ruta);
  String frase;
            do {
               
                frase = miBuffer.read();

                // Try-with-resources para asegurar que los recursos sean cerrados correctamente
                if (!frase.isEmpty()) {
                    miBuffer.write(frase);
                    miBuffer.newLine();
                    System.out.println("Archivo Ed113.dat creado exitosamente.");
                }
            } while (!frase.isEmpty());
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
    }
    
}

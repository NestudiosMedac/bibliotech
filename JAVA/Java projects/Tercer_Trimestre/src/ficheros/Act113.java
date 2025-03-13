package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act113 {

    public static void main(String[] args) {
        String ruta = "src/ficheros/datos/Ed113.dat";
        Scanner teclado = new Scanner(System.in);
        String frase;
        try (BufferedWriter miBuffer = new BufferedWriter(new FileWriter(ruta, true))) {

            do {
                System.out.println("Ingrese una frase:");
                frase = teclado.nextLine();

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

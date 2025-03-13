/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjColecciones;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 2.- Dado un archivo de texto que contiene palabras separadas por espacios,
 * escribe un programa en Java que lea el archivo, identifique y almacene todas
 * las palabras únicas y las vuelque en un fichero de texto (pej: salida.txt) de
 * forma ordenada.
 *
 * @author Nuria
 */
public class act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // 2. Creamos los flujos de lectura y escritura  
        String Ruta = "src/EjColecciones/act2.txt";
        BufferedReader miBufferLectura = null;
        BufferedWriter miBufferEscritura = null;
        String leido = "";
        String RutaOrdenada = "src/EjColecciones/act2Ordenado.txt";
        try {

            do {
                miBufferLectura = new BufferedReader(new FileReader(Ruta));
                miBufferEscritura = new BufferedWriter(new FileWriter(RutaOrdenada, true));
                leido = miBufferLectura.readLine();
                if (leido != null) {
                    HashSet<String> Palabras = new HashSet<>();
                    String[] trozos;
                    trozos = leido.split(" ");
                    for (int i = 0; i < trozos.length; i++) {
                        Palabras.add(trozos[i]);
                    }
                    for (String Palabra : Palabras) {
                         miBufferEscritura.write(Palabra + " ");
                    miBufferEscritura.newLine();
 
                    }
                  
                }

            } while (leido != null);
            // 3. Leer y jugar con el contenido
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: No se han podido cerrar los "
                    + "flujos de datos o problema leyendo.");
            System.out.println(e.getMessage());
        } finally {
            // 4. Cierro todos los flujos
            try {
                if (miBufferEscritura != null) {
                    miBufferEscritura.close();
                }
                if (miBufferLectura != null) {
                    miBufferLectura.close();
                }
            } catch (IOException e) {
                System.out.println("Error: Cerrando flujo de datos");
                System.out.println(e.getMessage());
            }
        }
    }

}

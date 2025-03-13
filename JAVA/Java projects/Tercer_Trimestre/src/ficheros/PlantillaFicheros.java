package Ficheros;

//Solo LECTURA
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//Solo ESCRITURA
import java.io.FileWriter;
import java.io.BufferedWriter;
//import java.io.IOException;

public class PlantillaFicheros {

    public static void main(String[] args) {

        // 2. Creamos los flujos de lectura y escritura  
        String ruta = "src/Ficheros/datos/Prueba2.txt";
        BufferedReader miBufferLectura = null;
        BufferedWriter miBufferEscritura = null;

        try {
            miBufferLectura = new BufferedReader(new FileReader(ruta));

            miBufferEscritura = new BufferedWriter(new FileWriter(ruta, true));//True para que te escriba al final del fichero, false sobreescribe

            // 3. Leer y jugar con el contenido
            String cadena = miBufferLectura.readLine();

            while (cadena != null) {
                cadena = miBufferLectura.readLine();
            }

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

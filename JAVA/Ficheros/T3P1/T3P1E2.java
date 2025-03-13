/* Modelo B */
package T3P1;

/* Importar herramientas que voy a usar */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class T3P1E2 {

    public static void main(String[] args) {

        /* Rutas de los ficheros */
        String ruta = "src/T3P1/analisisB.txt";
        String rutaEscritura = "src/T3P1/resultadosB.txt";
        /* Buffer de lectura y escritura */
        BufferedReader bufferLector = null;
        BufferedWriter bufferEscritor = null;
        /* Variables de apoyo en las cuales guardo las lineas a leer, las comprobaciones de cada linea */
        String linea = "", comprobaciones = "";
        int contadorAbre = 0, contadorCierra = 0;

        try {
            /* Abrimos el buffer y metemos la ruta del lector dentro */
            bufferLector = new BufferedReader(new FileReader(ruta));

            do {
                /* Lee la linea */
                linea = bufferLector.readLine();
                /* Reset de valores para cada linea */
                contadorAbre = 0;
                contadorCierra = 0;
                if (linea != null) {
                    /* Divide la linea caracter por caracter */
                    String[] caracteres = linea.split("");
                    for (int i = 0; i < caracteres.length; i++) {
                        /* Comparamos los caracteres y si encuentra alguno de ellos suma una al contador */
                        switch (caracteres[i]) {
                            case "[":
                                contadorAbre++;
                                break;
                            case "]":
                                contadorCierra++;
                                break;
                            case "(":
                                contadorAbre++;
                                break;
                            case ")":
                                contadorCierra++;
                                break;
                        }
                    }
                    /* Compruebo si está balanceada o no cada linea */
                    if (((contadorAbre % 2) + (contadorCierra % 2)) == 0) {
                        comprobaciones += "Linea balanceada.\n";
                    } else {
                        comprobaciones += "Linea NO balanceada.\n";
                    }
                }
            } while (linea != null);

            /* Muestro por pantalla las comprobaciones */
            System.out.println(comprobaciones);

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: Pon la ruta bien!");
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero.");
        } finally {
            /* Cerrar flujo */
            try {
                if (bufferLector != null) {
                    bufferLector.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrando el flujo.");
            }
        }

        File fichero = new File(rutaEscritura);
        /* Comprobamos si existe el fichero */
        if (!fichero.exists()) {
            try {
                /* Creamos el fichero */
                fichero.createNewFile();
                System.out.println("El fichero resultadosB.txt se ha generado con éxito.");
                /* Controlamos que se cree correctamente */
            } catch (IOException e) {
                System.out.println("ERROR: creando el fichero | " + e.getMessage());
            }
        }

        try {
            bufferEscritor = new BufferedWriter(new FileWriter(rutaEscritura));
            
            bufferEscritor.write(comprobaciones + "");
            
            
        } catch (IOException e) {
            System.out.println("ERROR: Falla el Filewriter (abriendo fichero). " + e.getMessage());
        } finally {
            try {
                /* Cerrar flujo */
                if (bufferEscritor != null) {
                    bufferEscritor.close();
                }
            } catch (Exception e) {
                System.out.println("ERROR: Cerrando los flujos." + e.getMessage());
            }
        }

    }
}

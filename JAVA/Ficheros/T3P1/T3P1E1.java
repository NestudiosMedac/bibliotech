/* Modelo B */

package T3P1;

/* Importar herramientas que voy a usar */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class T3P1E1 {

    public static void main(String[] args) {

        /* Creamos el scanner */
        Scanner teclado = new Scanner(System.in);
        /* Variables */
        int L = 0, N = 0;
        String ruta = "src/T3P1/numerosB.txt";

        /* Controlamos las posibles excepciones y que el valor sea mayor a 2 */
        do {
            try {
                System.out.print("Numero de lineas del fichero: ");
                L = teclado.nextInt();
                if (L <= 2) {
                    System.out.println("Valores mayores a 2!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: debes introducir un n�mero!!");
                teclado.nextLine();
            }
        } while (L <= 2);

        do {
            try {
                System.out.print("Cantidad de n�meros por linea: ");
                N = teclado.nextInt();
                if (N <= 2) {
                    System.out.println("Valores mayores a 2!!");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: debes introducir un n�mero!!");
                teclado.nextLine();
            }
        } while (N <= 2);

        teclado.close();
        File fichero = new File(ruta);

        /* Comprobamos si existe el fichero */
        if (!fichero.exists()) {

            try {
                /* Creamos el fichero */
                fichero.createNewFile();
                System.out.println("El fichero numerosB.txt se ha generado con �xito.");
                /* Controlamos que se cree correctamente */
            } catch (IOException e) {
                System.out.println("ERROR: creando el fichero | " + e.getMessage());
            }
        }

        BufferedWriter bufferEscritor = null;

        try {
            /* Abrimos el buffer y metemos la ruta del escritor dentro */
            bufferEscritor = new BufferedWriter(new FileWriter(ruta));

            for (int i = 0; i < L; i++) {
                for (int j = 0; j < N; j++) {
                    /* Generamos n�meros aleatorios */
                    int random = (int) (Math.random() * (200 - 30 + 1) + 30);
                    /* Controlamos que no a�ada un "." en el ultimo lugar */
                    if (j < (N - 1)) {
                        bufferEscritor.write(random + ".");
                    } else {
                        bufferEscritor.write(random + "");
                    }
                }
                bufferEscritor.newLine();
            }

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

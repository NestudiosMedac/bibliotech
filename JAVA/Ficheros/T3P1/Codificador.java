/* Modelo B */
package T3P1;

/* Importar herramientas que voy a usar */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Codificador {

    private String ruta, textoOriginal, textoCodificado;

    public Codificador(String ruta) {
        this.ruta = ruta;
        this.textoOriginal = "";
        this.textoCodificado = "";
    }

    public String leetTexto() throws FileNotFoundException, IOException {
        /* Buffer de lectura */
        BufferedReader bufferLector = null;
        String linea = "";

        bufferLector = new BufferedReader(new FileReader(this.ruta));
        do {
            /* Lee la linea */
            linea = bufferLector.readLine();
            if (linea != null) {
                this.textoOriginal += linea + "\n";
            }
        } while (linea != null);
        bufferLector.close();
        return this.textoOriginal;
    }

    public String codificar() throws IOException {
        if (!this.textoOriginal.isEmpty()) {
            char letra;
            for (int i = 0; i < this.textoOriginal.length(); i++) {
                letra = this.textoOriginal.charAt(i);
                if ((letra >= 'A') && (letra <= 'Z')) {
                    letra += 3;
                } else if ((letra >= 'a') && (letra <= 'z')) {
                    letra += 2;
                } else if ((letra >= '0') && (letra <= '9')) {
                    letra += 1;
                } else if (letra == '\n') {
                    letra += 0;
                } else {
                    letra += 12;
                }
                this.textoCodificado += letra;
            }
        }
        return this.textoCodificado;
    }

    private String nuevaRuta() {
        /* Busca la ultima posición del "." */
        int pos = this.ruta.lastIndexOf(".");
        /* Concatena la ruta hasta el "." y añade la nueva extensión */
        String res = this.ruta.substring(0, pos + 1);
        /* Devuelve la ruta añadiendo la nueva extensión */
        return res + "cod";
    }

    public void volcarCodificacion() throws IOException {
        String rutaCod = this.nuevaRuta();
        File fichero = new File(rutaCod);
        BufferedWriter bufferEscritor = null;

        /* Comprobamos si existe el fichero */
        if (!fichero.exists()) {
            /* Creamos el fichero */
            fichero.createNewFile();
            System.out.println("El fichero se ha generado con éxito.");
        }
        
        if (!this.textoCodificado.isEmpty()) {
            bufferEscritor = new BufferedWriter(new FileWriter(rutaCod));
            bufferEscritor.write(codificar());
            bufferEscritor.close();
        }

    }
}

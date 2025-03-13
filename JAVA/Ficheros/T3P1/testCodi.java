package T3P1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class testCodi {

    public static void main(String[] args) {

        Codificador codi = new Codificador("src/T3P1/poema.txt");

        try {
            System.out.println(codi.leetTexto());
            
            System.out.println(codi.codificar());
            
            
            codi.volcarCodificacion();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Fichero no encontrado." + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: Fichero no encontrado." + e.getMessage());
        }
        
        
        
    }

}

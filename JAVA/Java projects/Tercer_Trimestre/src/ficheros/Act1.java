/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 *
 * @author nuria
 */
public class Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "src/ficheros/datos/Act1.txt";
        BufferedReader mibuffer = null;

        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            int num;
            String linea = mibuffer.readLine();
            String cacho;
            //lee
            do {   //While ((linea= mibuffer.readLine())!=null)
//arreglar
                if (linea != null) {
                    //no es necesario usar mas de un lector 
                    num = Integer.parseInt(linea);//muy importante
                    cacho = linea.substring(linea.length() - num) + linea.substring(0, (linea.length() - num));
                    System.out.println(cacho);
                }
            } while (linea != null);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: No se han podido cerrar los "
                    + "flujos de datos o problema leyendo.");
            System.out.println(e.getMessage());

        }
    }

}

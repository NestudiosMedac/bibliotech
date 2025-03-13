/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

/**
 * COPIAR
 *
 * @author nuria
 */
//1-.Importar herramientas
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Leer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2-.Creamos los flujos de lectura
        String ruta = "src/ficheros/datos/waka.txt";
//FileReader hpracista=null;
        BufferedReader mibuffer = null;
        try {
            //hpracista=new FileReader(ruta);
            mibuffer = new BufferedReader(new FileReader(ruta));//de esta manera esta el writer dentro del buffered y ahorras codigo, sino seria asi    br = new BufferedReader(hpracista);
            //3.-Escribir lo que necesite
            String linea = mibuffer.readLine();

        } catch (FileNotFoundException e) {

            System.out.println("1-.No encuentro el archivo)");//disco duro pocho
        } catch (IOException e) {
            System.out.println("2.-Error leyendo");
        } finally {
            try {
                //4.-Cerrar flujos
                if (mibuffer != null) {
                    mibuffer.close();
                }

            } catch (IOException e) {
                System.out.println("3.-Fallo cerrando Flujos");
            }

        }
    }

}

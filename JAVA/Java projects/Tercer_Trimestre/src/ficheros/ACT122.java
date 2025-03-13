/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * file fich=new File(ruta); fich.exist();
 *
 * try abro para lectura catch file not found exception trycatch Ios
 *
 * @author nuria
 */
public class ACT122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a Hol Horse Alone!");
        System.out.println("Introduzca su nombre:");
        String nombre = teclado.next();
        String ruta = "src/ficheros/datos/nombre_de_jugador.dat";
        File fich=new File(ruta); 
        
        BufferedReader leer = null;
        BufferedWriter escribir = null;
        /*String[] trozos =null;
          trozos=linea.split(":");
               if (!trozos[1].equalsIgnoreCase(nombre))
                  escribir.write(nombre);*/
        
        try {

            leer = new BufferedReader(new FileReader(ruta));
            escribir = new BufferedWriter(new FileWriter(ruta,true));
            String linea = leer.readLine();
                if(!fich.exists()){
            File nombre_de_jugador = new File(ruta);
        }
             

        } catch (FileNotFoundException e) {

            System.out.println("1-.No encuentro el archivo)");
        } catch (IOException e) {
            System.out.println("2.-Error leyendo");
        } finally {
            try {

                if (leer != null) {
                    leer.close();
                }
                escribir.close();
            } catch (IOException e) {
                System.out.println("3.-Fallo cerrando Flujos");
            }

        }
    }

}

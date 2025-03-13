/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nuria
 */
public class Act115 {

    /**
     * @param args the command line arguments 115.- Realiza un programa que lea
     * el fichero números.txt que contendrá un número entero en cada línea.
     *
     * a) Calcula el mayor y el menor numero del fichero. b) Amplia el programa
     * para que además cuente cuantas veces aparece el mayor y el menor
     */
    public static void main(String[] args) {
        // 2-.Creamos los flujos de lectura
        String ruta = "src/ficheros/datos/números.txt";
        BufferedReader mibuffer = null;
       
        int limite = 0;
        int[] array = new int[limite];
        String  linea = new BufferedReader(new FileReader(ruta));
        try {

   
            //3.-Escribir lo que necesite
            while ((linea = mibuffer.readLine()) != null) {//cuenta las lineas
                limite++;
            }
            for (int i = 0; i < limite; i++) {
                int num = Integer.parseInt(linea);//pasa los numeros
                array[i] = num;
                System.out.println(array[i]);

            }/*
       
       String ruta = "src/ficheros/datos/números.txt";
        BufferedReader mibuffer = null;
        String linea;
        int mayor = Integer/.MIN_VALUE;//toma el menor
        int menor = Integer.MAX_VALUE;//toma el mayor
        int conteoMayor = 0;
        int conteoMenor = 0;
        int num=
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));

            while ((linea = mibuffer.readLine()) != null) {
                int num = Integer.parseInt(linea);
                if (num > mayor) {
                    mayor = num;
                    conteoMayor = 1;
                } else if (num == mayor) {
                    conteoMayor++;
                }
                if (num < menor) {
                    menor = num;
                    conteoMenor = 1;
                } else if (num == menor) {
                    conteoMenor++;
                }
            }

            System.out.println("El mayor número es: " + mayor + ", y aparece " + conteoMayor + " veces.");
            System.out.println("El menor número es: " + menor + ", y aparece " + conteoMenor + " veces.");
*/

        } catch (FileNotFoundException e) {

            System.out.println("1-.No encuentro el archivo)");
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

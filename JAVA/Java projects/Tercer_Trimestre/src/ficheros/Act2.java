/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Nuria
 */
public class Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "src/ficheros/datos/Act2.txt";
        BufferedReader mibuffer = null;
        double Notas;
        int cd;
        String linea;
        String[] Cachos;
        Double[] guardarNotas;
        Double[] guardarNotasOrdenadas;
        Double Candidato;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            //lee
            // while ((linea = mibuffer.readLine()) != null) {
            linea = mibuffer.readLine();//leo
            Cachos = linea.split(" ");//separar

            guardarNotas = new Double[linea.length()];
            guardarNotasOrdenadas = new Double[linea.length()];

            for (int i = 0; i < Cachos.length; i++) {

                Notas = Double.parseDouble(Cachos[i]);//pasar cachos de String a Double
                guardarNotas[i] = (Notas);//guardar esas notas en un string double
                System.out.println(guardarNotas[i]);//para revisar
            }
            for (int j = 0; j < guardarNotas.length; j++) {
                Candidato = guardarNotas[0];
                if (Candidato > guardarNotas[j]) {
                    guardarNotasOrdenadas[j] = guardarNotas[j];
                    Candidato = guardarNotas[j];

                }
                System.out.println(guardarNotasOrdenadas[j]);
            }

            //   cd = Integer.parseInt(linea);
            // 
            // }
        } catch (FileNotFoundException e) {

            System.out.println("1-.No encuentro el archivo)");//disco duro pocho
        } catch (IOException e) {
            System.out.println("2.-Error leyendo");
        } catch (NumberFormatException e) {
            System.out.println("3.-No se puede convertir de String a double");
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

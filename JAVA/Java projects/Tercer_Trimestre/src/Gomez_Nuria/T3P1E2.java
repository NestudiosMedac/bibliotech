/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gomez_Nuria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.table.TableStringConverter;

/**
 *
 * @author nuria
 */
public class T3P1E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2-.Creamos los flujos de lectura
        String ruta = "src/Gomez_Nuria/analisisB.txt";
        BufferedReader mibuffer = null;
        try {
            mibuffer = new BufferedReader(new FileReader(ruta));
            //3.-Escribir lo que necesite
            String linea = mibuffer.readLine();   
        
            do{
                if (linea!=null){
                   linea=mibuffer.readLine();
                    char abrirC=linea.charAt(0);
                    String abrirS=Character.toString(abrirC);//La S es para marcar que es String
                   char cerrarC=linea.charAt(6);//La C es para marcar que es char y al hacer la conversion no tener confusiones
                    String cerrarS=Character.toString(cerrarC);
         if (linea.contains(abrirS)&& linea.contains(cerrarS)){//. conteins te dice si la cadena que le pasas por parametros esta dentro de quien lo usa(linea)
             System.out.println("Linea balanceada");
         }else{
             System.out.println("Linea no balanceada");
         }
       
                }
            }while(linea!=null);

        } catch (FileNotFoundException e) {

            System.out.println("1-.No encuentro el archivo");
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

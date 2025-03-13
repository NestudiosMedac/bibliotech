package ficheros;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nuria
 */
//1-.Importar herramientas
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Escritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2-.Creamos los flujos de lectura
        String ruta = "src/ficheros/datos/Waka.txt";
//FileWriter hpracista=null;
        BufferedWriter br = null;
        try {
            //hpracista=new FileWriter(ruta);  //el true activa el appendmode escribe al final del fichero
            br = new BufferedWriter(new FileWriter(ruta, true));//de esta manera esta el writer dentro del buffered y ahorras codigo, sino seria asi    br = new BufferedWriter(hpracista);
            //3.-Escribir lo que necesite
            br.write("Karlos,Karlos, el de los ***** largos.");//usar \n es mala practica pero se puede
            br.newLine(); //br.write(system.lineSeparator());, mejor el br.newLine, la clase System esta relacionada con el SO
            br.newLine();
            br.write("Vicente, el de mi ***** en tu frente.");

            int suma = 8 + 10;//arreglar
            br.write(suma);

            for (int i = 0; i < 10; i++) {
                br.newLine(); 
                br.write("patata");
            }

        } catch (IOException e) {
            System.out.println("Posible ERROR: ");
            System.out.println("1-.O falla el FileWriter (abriendo fichero)");//disco duro pocho
            System.out.println("1-.O falla el FileWriter (abriendo fichero)");//disco duro pocho

        } finally {
            try {
                //4.-Cerrar flujos
                br.close();
            } catch (IOException e) {
                System.out.println("Fallo cerrando Flujos");
            }

        }
    }

}

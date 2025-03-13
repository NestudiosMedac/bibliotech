/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gomez_Nuria;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 *
 * @author nuria
 */
public class Codificador {

    private final String ruta;
    private String TextoOriginal;
    private String TextoCodificado;

    public Codificador(String Archivo) {
        this.ruta = Archivo;
        this.TextoOriginal = null;
        this.TextoCodificado = null;
    }

    public String leerTexto() throws IOException, FileNotFoundException {
        
        BufferedReader lector = null;
        String leido = "";
        lector = new BufferedReader(new FileReader(this.ruta));
        do {
            leido = lector.readLine();
            if (leido != null) {

                this.TextoOriginal = leido;
                return leido;
            }
        } while (leido != null);
        return null;
    }

    public String Codificar() {
        if(!this.TextoOriginal.isEmpty()){
            
       // this. TextoOriginal.replace(A,"65"); tenia planteado algo asi

       return "";
    }
        return "";
    }

    public void volcarCodificacion() throws IOException {
        if(!this.TextoCodificado.isEmpty()){
            String RutaVolcar=(this.ruta.length()-3)+"cod";
        BufferedWriter escritor = null;
  escritor = new BufferedWriter(new FileWriter(this.ruta, true));
        escritor.write(this.TextoCodificado);
        escritor.close();
        }
    }

}
/*
   
 */

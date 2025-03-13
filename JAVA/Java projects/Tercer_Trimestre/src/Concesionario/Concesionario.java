/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Concesionario;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author nuria
 */
public class Concesionario {

    String nombre;
    String direccion;
    private Vehiculo[] CochesGuardados;

    public Concesionario(String nombre, String direccion, int tam) {
        this.nombre = nombre;
        this.direccion = direccion;

        for (int i = 0; i < tam; i++) {
            this.CochesGuardados = null;
        }

    }

    public Concesionario(String ruta) {
    }

    public void aniadirVehiculo(Vehiculo nuevo) {//listo
        int contador = 0;
        for (int i = 0; i < CochesGuardados.length; i++) {
            if (this.CochesGuardados[i] == null && contador == 0) {
                this.CochesGuardados[i] = nuevo;
                contador++;
                // System.out.println("Coche guardado");
            }
            contador = 0;

        }
    }

    public void leerListaVehiculos(String ruta) {
        String rutaf = "src/ficheros/datos/" + ruta + ".cns";
        BufferedReader mibuffer = null;
        try {

            mibuffer = new BufferedReader(new FileReader(rutaf));
            //3.-Escribir lo que necesite
            String linea = mibuffer.readLine();
//formato mas adelante
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

    private int buscarVehiculo(String matricula) {//listo
        for (int i = 0; i < CochesGuardados.length; i++) {
            if (this.CochesGuardados[i].getMatricula().equalsIgnoreCase(matricula)) {
                return i;
            }
        }
        return -1;
    }
    
    public boolean borrarVehiculo(String matricula){//listo
        for (int i = 0; i < CochesGuardados.length; i++) {
            if (this.CochesGuardados[i]==null|| this.CochesGuardados[i].getMatricula().equalsIgnoreCase(matricula)) {
                this.CochesGuardados[i]=null;
                return true;
            }
        }
        return false;
    
    }
}

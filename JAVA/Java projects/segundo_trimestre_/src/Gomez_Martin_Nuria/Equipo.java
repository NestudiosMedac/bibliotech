/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gomez_Martin_Nuria;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class Equipo {

    private String nombrequipo;
    private String nombrejugador[];//inicializo el array
    private int indice; //el indice nos ayuda para no tener que hacer 500 bucles
    private int tam;//es el max de personas
    Scanner teclado = new Scanner(System.in);//para poder pedir al usuario

    public Equipo(String nombrequipo, int tam) {//constructor
        this.nombrequipo = nombrequipo;
        this.nombrejugador = new String[tam];

        for (int i = 0; i < tam; i++) {//lleno el array vacio
            this.nombrejugador[i] = "hueco";
        }
    }

    public boolean llena(int tam) {//muestra si el equipo esta lleno o no
        boolean llena = true;
        if (this.indice != nombrejugador.length - 1) {
            return false;
        }
        return llena;
    }

    public void aniadirJugador(String elemento, int tam) {
        if (tam >= 0 && tam < this.nombrejugador.length - 1) {
            this.nombrejugador[tam] = elemento;
            this.actualizarPos();
        }

    }

    public String getnombrequipo() {//solo muestra
        return nombrequipo;
    }

    public void setnombrequipo(String newNombreEquipo) {//para cambiar el nombre del equipo
        this.nombrequipo = newNombreEquipo;
        this.nombrequipo = teclado.next();
    }

    public void mostrarLista() {
        System.out.println("Los jugadores actuales del equipo son:");
        for (int i = this.nombrejugador.length - 1; i >= 0; i--) {

            if (this.nombrejugador[i].equalsIgnoreCase("")) {
                System.out.println(this.nombrejugador[this.indice]);
            } else {
                System.out.println("HUECO VACIO");
            }
        }

    }

    public Equipo(int tam2) {//sobrecarga del constructor
        this.tam = tam2;
        this.indice = 0;
    }

    public Equipo(Equipo original) {//constructor copia
        this.nombrequipo = original.nombrequipo;
        this.nombrejugador = original.nombrejugador;//No estoy segura si es la manera correcta
    }

    private void actualizarPos() {
        //busco hueco vacio "hueco"
        boolean encontrado = false;
        int i = 0;
        while (i < this.nombrejugador.length && !encontrado) {//busca sitio vacio 

            if (this.nombrejugador[i].equalsIgnoreCase("hueco")) { //y lo marca para usarlo en el añadir jugador
                this.indice = i;
                encontrado = true;
                System.out.println(" Jugador aniadido");
            }
            i++;
        }//si no he encontrado ningun hueco, te dice que no puede añadir
        if (!encontrado) {
            System.out.println("No se puede añadir mas jugadores");
            llena(i);
        }
    }

    public String toString() {//método para devolver la información.
        String res = "";
        res += "Nombre del equipo:" + this.nombrequipo + "\n";
        res += "Los jugadores actuales del equipo son:";
        for (int i = this.nombrejugador.length - 1; i >= 0; i--) {
            res += this.nombrejugador[this.indice] + "\n";
        }
        return res;
    }
}

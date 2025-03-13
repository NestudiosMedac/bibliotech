/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musica;

/**
 *
 * @author Nuria
 */
public class Partitura {

    String nombre;
    String autor;
    Nota listaNotas[];//must be private

    public Partitura(String nombre, String autor) {// en la practica no pongas los parametros iguales
        this.nombre = nombre;
        this.autor = autor;
        this.listaNotas = new Nota[100];//prefiero poner una variable, esta act te pide 100   

        for (int i = 0; i < this.listaNotas.length; i++) {//no estaba mal lo que hiciste
            this.listaNotas[i] = null;
        }
    }

    public int numNotas() {
        int contador = 0;

        for (int i = 0; i < listaNotas.length; i++) {
            if (listaNotas[i] != null) { //i=listaNotas.length && listaNotas[i]!=null si fuera while
                contador++;
            }
        }
        return contador;//si quieres sacar un int tienes que cambiar el void, esto devuelve
    }

    public boolean addNota(Nota nueva) {
        boolean aniadida = false;
        int i;
        for (i = 0; i < listaNotas.length && listaNotas[i] != null; i++) {//busca un hueco 
        }
        if (i < listaNotas.length) {//lo rellena solo con esa nota
            this.listaNotas[i] = nueva;
            aniadida = true;
        }
        return aniadida;
    }

    /*  public boolean addNota(Nota nueva){//esta esta perfe
        int i=0;
    boolean aniadia=false
        while(i < listaNotas.length)&&(!aniadida) {//busca un hueco 
        if (listaNotas[i]==null) {//lo rellena solo con esa nota
            this.listaNotas[i] = nueva;
             aniadida = true;
        }
    i++
    }
        return aniadida;
    }*/
    @Override
    public String toString() {
        String res = "";//podias haber metido la primera linea
        res += this.nombre + " de " + this.autor + "\n";

        for (int i = 0; i < this.listaNotas.length; i++) {//no te comas los this.
            if (i % 10 == 0) {
                res += "\n";
                if (this.listaNotas[i] != null) {
                    res += "[" + this.listaNotas[i] + "]";
                }
            } else {
                if (this.listaNotas[i] != null) {
                    res += "[" + this.listaNotas[i] + "]";
                }
            }
        }
        return res;
    }

    /*
    @Override
    public String toString() { NO ESTA COMPLETO
        String res = this.nombre + " de " + this.autor;

        for (int i = 0; i < this.listaNotas.length; i++) {//no te comas los this.
            if ((i+1) % 10 == 0) {
                res += "\n";
               
                }
    if(this.lista[i]!=null){
           res+=this.lista[i].toString()+"";
            }
        }
        return res;
    }*/
}

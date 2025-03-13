/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo.Loteria;

/**
 * @author nuria
 *
 * Vamos a crear una clase para hacer SORTEOS Los sorteos se harán sacando
 * numeros que guardaran los números premiados en el sorteo y un número que
 * guardará el reintegro.
 *
 * Constructor recibirá la cantidad de números premiados para el sorteo, creará
 * el array y rellenará todo con el valor -1 y un reintegro.
 *
 * -El método sortear(int máximo) saca tantos números aleatorios entre 1 y
 * máximo como números premiados tiene la clase.
 *
 * -El metodo comprobarGanadores (int lista[]) saca por pantalla cuantos numeros
 * ganadores tiene la lista que se le pasa como parámetro.
 *
 * -Y un toString que devuelve como cadena los números premiados( en horizontal
 * separados por comas) y el reintegro(debajo de los números premiados).
 */
public class Loteria {

    int premiado[];
    int reintegro;
    public Loteria(int cantidad) {
        this.premiado = new int[cantidad];
        this.reintegro = -1;

        for (int i = 0; i < this.premiado.length; i++) {
            this.premiado[i] = -1;

        }
        
        

    public void sortear(int maxi){
        for (int i = 0; i < this.premiado.length; i++) {
            this.premiado[i] = (int) (Math.random());
            //falta algo aqui

        }
    } 


    public void comprobarGanadores(int[] numeros){
        int coinciden=0;
        coinciden++;
    }

    }

}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Monstro;

/**
 *
 * @author nuria Queremos crear un juego en el que vamos a tener unas criaturas
 * llamadas “Monstros”. Para ello hay que crear una clase que represente estas
 * criaturas. De cada Monstro necesitamos guardar su nombre, sus puntos de
 * esfuerzo, sus vidas totales, sus puntos de hambre y su estado (vivo o
 * muerto).
 *
 * Además, cada Monstro puede comer, comunicarse, jugar y dormir. De momento,
 * las reglas que rigen el juego son:
 *
 * • Los valores de esfuerzo, hambre y vidas no pueden superar los valores
 * iniciales. •
 *
 *
 */
public class Monstro {
//en orden
    private String nombre;
    private int /*p*/esfuerzo = 10;//Un Monstro empieza con 10 puntos de esfuerzo
    private int hambre = 3;//3 puntos de hambre
    private int vida = 7;//7 vidas
    private boolean estado = true;//true vivo/false morido
    
    /* es mas sencillo si se meten finales
    private final MAXHAMBRE=3;
    private final MAXESFUERZO=10;
    private final MAXVIDA=7;*/

    public Monstro(String nombre) {//El constructor sólo necesita el nombre del Monstro.
        this.nombre = nombre;
       /* this.vidas=this.MAXVIDAS;
        this.pesfuerzo=this.MAXESFUERZO
        this.phambre=this.MAXHAMBRE*/
    }

    public void comer(int b) {//Si come, gasta dos puntos de esfuerzo y gana dos de hambre, 3 comida fav.
        if (this.estado = true) {
            if (this.hambre <= 3) {
                this.esfuerzo -= 2;
                if (b == 1) {
                    this.hambre += 2;
                }
                if (b == 2) {
                    this.hambre += 3;
                }
                perderVida();
                morir();
            } else {
                this.hambre = 3;
                System.out.println(this.nombre + " esta lleno ya no puede comer más");
            }
        } else {
            System.out.print(this.nombre + " esta morido...");
        }

    }

    public void comunicarse() {// Al comunicarse gasta 1 punto de esfuerzo.
        if (this.estado = true) {
            this.esfuerzo -= 1;
            System.out.print(this.nombre + " esta comunicandose...");
            perderVida();
            morir();
        } else {
            System.out.print(this.nombre + " esta morido, muy muerto...");

        }

    }

    public void jugar() {//Al jugar gasta 3 puntos de esfuerzo y 1 de hambre.
        if (this.estado = true) {
            this.esfuerzo -= 3;
            this.hambre -= 1;
            perderVida();
            morir();
        } else {
            System.out.print(this.nombre + " esta morido pobrecito :( ...");
        }
    }

    public void dormir() {//Al dormir gana 5 puntos de esfuerzo.Done
        if (this.estado = true) {
            if (this.esfuerzo < 10) {
                this.esfuerzo += 5;
            } else {
                this.esfuerzo = 10;
                System.out.print(this.nombre + " ya no puede mimir mas...");
            }
        } else {
            System.out.print(this.nombre + " esta morido ay lastima ...");

        }
    }

    private void perderVida() { //Si los puntos de esfuerzo o de hambre llegan a cero, el Monstro perderá una vida y volverá a vivir con los valores por defecto. 
        if (this.esfuerzo <= 0 || this.hambre <= 0) {
            if (0 > this.vida) {
                this.vida=0;
                System.out.print(this.nombre + " acaba de perder una vida...");
            } else {
                this.vida -= 1;
                this.hambre = 3;
                this.esfuerzo = 10;
            }
        }
    }

    private void morir() {// Si el Monstro pierde todas las vidas, muere, todos sus atributos tomarán el valor -1 y no podrá realizar ninguna acción.
        if (this.vida <= 0) {
            this.estado = false;
            this.hambre = -1;
            this.esfuerzo = -1;
            System.out.print(this.nombre + " acaba de morir...");

        }
    }
}

/* Meter morir dentro de perder vida */
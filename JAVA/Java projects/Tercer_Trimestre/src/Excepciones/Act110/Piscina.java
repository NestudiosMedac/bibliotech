/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.Act110;

/**
 *
 * @author Nuria
 */
public class Piscina {

    public final int MAXNIVEL;
    private int nivel;

    public Piscina(int tope) {
        if (tope < 0) {
            tope = 0;
        }
        this.MAXNIVEL = tope;
        this.nivel = 0;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void quitarAgua(int cantidad) throws ArithmeticException {//aqui podrias poner WaterOnTheLimitExeption

        if (cantidad < 0) {
            throw new ArithmeticException("cantidad de agua incorrecta");
        } else if (this.nivel - cantidad > 0) {
            throw new ArithmeticException("Que mas vas a quitarle si ya no hay mas agua?");
        }
        this.nivel -= cantidad;
    }

    public void ponerAgua(int cantidad) throws ArithmeticException {
        if (cantidad < 0) {
            throw new ArithmeticException("cantidad de agua incorrecta");
        } else if (this.nivel + cantidad < 0) {
            throw new ArithmeticException("No le puedes echar mas que boza melon");
        }
        this.nivel += cantidad;
    }
}

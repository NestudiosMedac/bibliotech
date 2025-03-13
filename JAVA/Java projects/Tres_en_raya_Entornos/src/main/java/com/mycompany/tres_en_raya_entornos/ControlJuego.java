package com.mycompany.tres_en_raya_entornos;


import java.util.Arrays;
/**
* @autor Aurelio y Nuria
* @version 0.1
*/
public class ControlJuego {

    private Tablero tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private int turno;
/**
* contructor del Control del Juego
*/
    public ControlJuego() {
        tablero = new Tablero();
        jugador1 = new JugadorHumano("Jugador 1");
        jugador2 = new IA("IA");
        turno = 1; // Empieza el jugador 1
    }
/**
* Metodo que inicia la partida
*/
    public void iniciarPartida() {
        tablero.inicializarTablero();
        turno = 1;
        System.out.println("¡Comienza la partida...");
        System.out.println("Turno del Jugador 1");
    }
/**
* Metodo efectua un movimiento
* @param x Marca la posicion horizontal de la ficha
* @param y Marca la posicion vertical de la ficha
*/
    public void hacerMovimiento(int x, int y) {
        boolean movimientoExitoso = jugador1.distribuirFicha(x, y, tablero);
        if (!movimientoExitoso) {
            System.out.println("No se puede hacer el movimiento. Intenta de nuevo.");
            return;
        }
        System.out.println("Movimiento realizado.");
        if (turno == 1) {
            turno = 2;
            System.out.println("Turno del Jugador 2");
        } else {
            turno = 1;
            System.out.println("Turno del Jugador 1");
        }
        tablero.verTablero();
    }
    
/**
* Metodo que finaliza la partida
*/
    public void finalizarPartida() {
        System.out.println("Partida finalizada.");
    }
/**
* Metodo que muestra el tablero
*/
    public void verTablero() {
        tablero.verTablero();
    }
}
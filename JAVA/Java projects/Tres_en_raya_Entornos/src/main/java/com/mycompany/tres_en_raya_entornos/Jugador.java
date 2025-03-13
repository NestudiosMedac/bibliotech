package com.mycompany.tres_en_raya_entornos;
public abstract class Jugador {

    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }



    public abstract boolean distribuirFicha(int x, int y, Tablero tablero);
}
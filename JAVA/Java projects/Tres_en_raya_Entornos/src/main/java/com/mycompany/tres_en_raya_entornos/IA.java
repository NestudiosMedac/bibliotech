package com.mycompany.tres_en_raya_entornos;

public class IA extends Jugador {

    private int nivel;

    public IA(String nombre) {
        super(nombre);
    }

    @Override
    public boolean distribuirFicha(int x, int y, Tablero tablero) {
        System.out.println("Sin Desarrollar.");
        return false;
    }
}

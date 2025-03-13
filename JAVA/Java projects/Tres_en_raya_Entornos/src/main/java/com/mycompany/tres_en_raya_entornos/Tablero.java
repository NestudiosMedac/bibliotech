package com.mycompany.tres_en_raya_entornos;
public class Tablero {

    private Ficha[][] tablero;

    public Tablero() {
        tablero = new Ficha[3][3];
    }

    public void inicializarTablero() {
        // Rellenar el tablero con espacios en blanco
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = null;
            }
        }
    }

    public void verTablero() {
        System.out.println("   0  1  2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j].getForma() + " ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }

    public boolean esEspacioValido(int x, int y) {
        return tablero[x][y] == null;
    }

    public void colocarFicha(int x, int y, Ficha ficha) {
        if (esEspacioValido(x, y)) {
            tablero[x][y] = ficha;
        }
    }

    public boolean hayGanador() {
        //No lo hemos conseguido hacer profesor.
        return false;
    }
}

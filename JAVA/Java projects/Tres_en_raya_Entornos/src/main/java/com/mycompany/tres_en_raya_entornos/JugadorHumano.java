package com.mycompany.tres_en_raya_entornos;

public class JugadorHumano extends Jugador {

    private String nombre;
    private String usuario;
    private String pass;

    public JugadorHumano(String nombre) {
        super(nombre);
        this.nombre = nombre;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public boolean distribuirFicha(int x, int y, Tablero tablero) {
        // Lógica para que el jugador humano realice un movimiento en el tablero
        System.out.println("Turno de " + this.getNombre());

        if (tablero.esEspacioValido(x, y)) {
            tablero.colocarFicha(x, y, new Ficha("[X]")); // Se coloca una ficha temporal solo como ejemplo
            return true; // Se realizó el movimiento exitosamente
        } else {
            System.out.println("Movimiento inválido. Prueva otra vez.");
            return false; // No se pudo realizar el movimiento
        }
    }
}

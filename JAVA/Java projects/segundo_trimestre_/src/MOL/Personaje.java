/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOL;

/**
 *
 * @author Nuria
 */
public abstract class Personaje {

    protected String nombre;
    protected int x, y;
    protected double P_vida;
    protected double P_ataque;
    protected double P_escudo;

    public Personaje(String nombre, int x, int y, double P_vida, double P_ataque, double P_escudo) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.P_vida = P_vida;
        this.P_ataque = P_ataque;
        this.P_escudo = P_escudo;
         ComprobarValores();
    }

    private void ComprobarValores() { //Operadores logicos && no me van ARREGLAR COMO EN DESPLAZARSE
        while (this.P_escudo < 0 || this.P_ataque < 0 || this.P_vida < 0) {
            if (this.P_vida < 0) {
                this.P_vida = 0;
                System.out.println("Por favor introduce un valor postivo");
            }
            if (this.P_ataque < 0) {
                this.P_ataque = 0;
                System.out.println("Por favor introduce un valor postivo");
            }
            if (this.P_escudo < 0) {
                this.P_escudo = 0;
                System.out.println("Por favor introduce un valor postivo");
            }
            

        }
    }

    private void desplazarse(int x, int y) {
        while (this.y >= 0 && this.x >= 0) {
            this.y += y;
            this.x += x;
        }
        if (this.y <= 0 && this.x <= 0) {
            this.y += 0;
        }
        this.x += 0;
    }
public abstract void atacar( Personaje defensor);

@Override
public String toString() {
  String res="";
res+="Personaje\n";
res+="Nombre=" +this.nombre+"\n";
res+="Posicion horizonal=" +this.x+"\n";
res+="Posicion vertical=" +this.y+"\n";
res+="Vida=" + this.P_vida+"\n";
res+="Danio=" +this.P_ataque+"\n";
  return res;
    }
}

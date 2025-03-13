/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOL;

/**
 *
 * @author Nuria
 */
public class Minion extends Personaje {

    String nombre;
    String tipo;
    double danio;

    public Minion(String tipo) {
        super("", 0, 0, 0, 0, 0);
        this.nombre = "Minion";
        this.x = (int) (Math.random() * (1520 - 400 + 1) + 400);
        this.y = (int) (Math.random() * (1520 - 400 + 1) + 400);
        this.tipo = tipo;
        ComprobarTipo();
        AsignarTipo();
    }

    private void ComprobarTipo() {
        while (!(tipo.equalsIgnoreCase("Melee") || tipo.equalsIgnoreCase("Canion") || tipo.equalsIgnoreCase("Mago"))) {
            this.tipo = "Melee";
        }
    }

    private void AsignarTipo() {
        switch (this.tipo) {
            case "Melee" -> {
                this.P_vida = 50;
                this.P_ataque = 10;
                this.P_escudo = 10;
            }
            case "Mago" -> {
                this.P_vida = 12;
                this.P_ataque = 30;
                this.P_escudo = 40;
            }
            case "Canion" -> {
                this.P_vida = 75;
                this.P_ataque = 25;
                this.P_escudo = 5;
            }
        }
    }

    @Override
    public void atacar(Personaje defensor) {

       String soy = "Soy un Minion y le pego ";
        String res;
        if (defensor instanceof Minion) {
            res = "un minion";

        } else {
            res = "un campero";

        }
       System.out.println(soy+res);
    }
}

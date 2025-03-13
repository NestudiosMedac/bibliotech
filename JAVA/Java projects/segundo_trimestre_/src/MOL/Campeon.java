/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOL;

/**
 *
 * @author Nuria
 */
public class Campeon extends Personaje {

    String nombre;
    double P_magia;
    int nivel;
    Habilidad Skill[];
    String rol;
    int indice;
    double danio;

    public Campeon(String nombre, Habilidad Skill, String rol) {
        super(nombre, 0, 0, 0, 0, 0);
        this.P_magia = 0;
        this.nivel = 1;
        this.x = (int) (Math.random() * (1920 - 1000 + 1) + 1000);
        this.y = (int) (Math.random() * (1920 - 1000 + 1) + 1000);
        this.Skill = new Habilidad[3];
        this.rol = rol;
        ComprobarRol();
        int indice = 0;

    }

    public void insertarHabilidad(String nombre, char tecla) {

        for (int i = indice; i < 3; i++) {
            Skill[indice] = new Habilidad(nombre, tecla);//el char no lo quiere;

        }
    }

    public void ComprobarRol() {
        while (!(rol.equalsIgnoreCase("Carry") || rol.equalsIgnoreCase("Tanque")
                || rol.equalsIgnoreCase("Support") || rol.equalsIgnoreCase("Mago")
                || rol.equalsIgnoreCase("Jungla"))) {
            this.rol = "Carry";
        }
    }

    public void AsignacionPuntos() {//(Math.random()*(maximo-minimo+1)+minimo);
        switch (this.rol) {
            case "Tanque": {
                AsignarPuntosRandom();
                this.P_magia = 100;
                this.P_vida += 150;
            }
            case "Carry": {
                AsignarPuntosRandom();
                this.P_magia = 300;
                this.P_escudo += 100;

            }
            case "Support": {
                AsignarPuntosRandom();
                this.P_magia = 300;
                this.P_vida += 50;
                this.P_escudo += 50;

            }
            case "Mago": {
                AsignarPuntosRandom();
                this.P_magia = 500;
                this.P_escudo += 150;

            }
            case "Jungla": {
                AsignarPuntosRandom();
                this.P_magia = 200;
                this.P_vida += 100;
            }

        }
    }

    public void AsignarPuntosRandom() {
        this.P_vida = (double) (Math.random() * (200 - 150 + 1) + 150);
        this.P_ataque = (double) (Math.random() * (7 - 3 + 1) + 3);
        this.P_escudo = (double) (Math.random() * (20 - 15 + 1) + 15);
    }

    public void subirNivel(Habilidad nueva) {// magia no se sube nonsense(?
        this.nivel++;
        this.P_vida += (double) (Math.random() * (9 - 1 + 1) + 1);
        this.P_ataque += ((double) (Math.random() * (9 - 1 + 1) + 1) / 10);
        this.P_escudo += ((double) (Math.random() * (9 - 1 + 1) + 1) / 10);

        if (nivel == 4 || nivel == 6 || nivel == 8) {
            while (indice < 3) {
                indice++;
            }

        }
    }

    @Override
    public void atacar(Personaje defensor) {
        String soy = "Soy un champeon y le pego a ";
                String res;
        if (defensor instanceof Minion) {
            res = "un minion";

        } else {
            res = "un campero\n";
        }
        System.out.println(soy+res);
    }
}

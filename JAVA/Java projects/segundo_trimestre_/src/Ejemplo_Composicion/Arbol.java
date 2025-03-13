/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Composicion;

/**
 *
 * @author nuria
 */
public class Arbol {

    private double altura;
    private int cantidadHojas;
    private String tipo;
    private double grosor;

    private Hoja hojas[];

    public Arbol(double alt, String tipex, double ambrosio, int diogenes) {
        this.altura = alt;
        this.tipo = tipex;
        this.grosor = ambrosio;
        this.cantidadHojas = diogenes;

        this.hojas = new Hoja[diogenes];

        for (int i = 0; i < diogenes; i++) {
            hojas[i] = new Hoja("verde");
        }

    } 

    public void germinarHojas() {
        for (int i = 0; i < this.cantidadHojas; i++) {
            hojas[i] = new Hoja("verde");
        }
    }

    public String toSTring() {
        String res = this.tipo + "\n";
        res += "Altura: " + this.altura + " mts\n";
        res += "Grosor: " + this.grosor + " cmts\n";
        
      
            res += "Sus hojas son...\n";
            for (int i = 0; i < this.cantidadHojas; i++) {
                  if (this.hojas[i] != null) {
                res += this.hojas[i] + "\n";
                  }
        }
        return res;

    }
}

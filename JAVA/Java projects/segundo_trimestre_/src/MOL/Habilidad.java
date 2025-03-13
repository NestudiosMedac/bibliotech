/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MOL;

/**
 *
 * @author Nuria
 */
public class Habilidad {
     String nombre;
    private double mana_cost;
    private int nivel;
     char tecla;
    double danio;

    public Habilidad(String nombre, char tecla) {
        this.nombre = nombre;
        this.danio = danio;
        this.nivel=1;
        this.mana_cost= (double)(Math.random()*(10))+(nivel/2);
        this.danio= (double)(Math.random()*(20-5+1))+(mana_cost/3);
        this.tecla=tecla;
    }
    
    public void subirNivel(){
        nivel++;
        this.mana_cost= (double)(Math.random()*(10))+(nivel/2);
        this.danio= (double)(Math.random()*(20-5+1)+5)+(mana_cost/3);
    }
    

    @Override
    public String toString() {
String res="";
res+="Habilidad\n";
res+="Nombre=" + this.nombre+"\n";
res+="Coste de mana=" + this.mana_cost+"\n";
res+="Nivel=" + this.nivel+"\n";
res+="Tecla=" + this.tecla+"\n";
res+="Danio=" + this.danio+"\n";
  return res;
    }
    
    
    
}

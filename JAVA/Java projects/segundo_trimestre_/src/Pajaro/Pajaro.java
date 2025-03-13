/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pajaro;

/**
 *
 * @author Nuria
 */
public class Pajaro {

    private String especie;
    private int edad;
    private Pluma plumas[];
    int cantPlumas;
 
    public Pajaro(String especia, int viejo) {
        this.especie = especia;
        this.edad = viejo;

        this.cantPlumas = (int) (Math.random() * (75 - 10 + 1) + 10);//(int)(Math.random()*(max-min+1)+min)
        this.plumas = new Pluma[this.cantPlumas];
        
        for (int i = 0; i < this.cantPlumas; i++) {
            int colorPluma = (int) (Math.random() * (3) + 1);
           int anchoPluma=(int) (Math.random() * (3) + 1);
            int largoPluma=(int) (Math.random() * (6-2+1) + 2);
          String color ="";
            switch (colorPluma) {
                case 1:
                    color+="Blanco";
                    break;
                case 2:
                     color="Negro";
                    break;
                case 3:
                     color="Amarillo";
                    break;
            }
            this.plumas[i]= new Pluma(anchoPluma, largoPluma, color);
        }

    }

    @Override
    public String toString() {
        String res="Pajaro "+this.especie+" con "+ this.edad+ " anios.\n";
      res+="Sus plumas son:\n";
        for (int i = 0; i < this.plumas.length; i++) {
          res+=this.plumas[i].toString()+"\n";
        }
        return res;
    }

}

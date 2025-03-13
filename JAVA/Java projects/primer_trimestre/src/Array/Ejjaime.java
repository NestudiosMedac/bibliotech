/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author nuria
 */
public class Ejjaime {
//buscar numero mayor y menor entre random de 100
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int menor=101;
          int mayor=0;
           int posmayor=0;
           int posmenor=0;
            int lista[] = new int [5];

        for (int i = 0; i < 5 ; i++) {
            lista[i] = (int) (Math.random()*101) +1;
           if (lista[i] > mayor) {
                mayor = lista[i];
                posmayor=i; 
                
            }if (lista[i]< menor){
              menor = lista[i];
                posmenor=i; 
         }
        }
          System.out.println("El elemento mayor es: "+mayor+" y la posicion es "+posmayor);
          System.out.println("El elemento menor es: "+menor+" y la posicion es "+posmenor);

    }
}

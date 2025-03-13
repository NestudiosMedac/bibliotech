/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.HashSet;//es el mejor para nosotros, +equilibrado;
//import java.util.TreeSet;
//import java.util.LinkedHashSet;

/**
 *
 * @author nuria
 */
public class TestColeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //uso como para guardar usuarios
        HashSet<String> bolsa = new HashSet<>();//tamaño dinamico //no existen posiciones
        HashSet<Guerrero> torneo = new HashSet<>();//tira de equals porque el mismo guerrero no se puede apuntar 2 veces
        
        bolsa.add("isma");
        bolsa.add("se");
        bolsa.add("SE");
        bolsa.add("duerme");
        bolsa.add("isma");//no sale porque ya hay un isma
        bolsa.add("isma");//no sale porque ya hay un isma
        bolsa.add("isma");//no sale porque ya hay un isma

        if(!bolsa.add("isma")){
            System.out.println("El elemento ISMA ya esta dentro de la bolsa");
        } if(!bolsa.contains("isma")){
            System.out.println("El elemento ISMA ya esta dentro de la bolsa");
        }
        
       // bolsa.size();
        //bolsa.clear();//la lista queda vacia, se carga los cajones, se queda la estructura
       // bolsa=null;//no hay nada salta error
        bolsa.remove("se");//devuelve verdadero o falso NO UN ERROR
        bolsa.isEmpty();//devuelve true si esta clear
       // bolsa.removeAll(lista); borra todos los elementos en bolsa que coinciden en lista, mejor ejemplo con numeros
       // bolsa.retainAll(lista);mantiene los elementos en bolsa que tambien coinciden en lista
        System.err.println(bolsa);//orden lexicografico
      
        //se recorren con un for each
  for (Guerrero guerrero : torneo) {
            
        }
    }

}

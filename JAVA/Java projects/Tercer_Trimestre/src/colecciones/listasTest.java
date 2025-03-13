/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;

/**
 *
 * @author nuria
 */
public class listasTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayList<&> nombre=new ArrayList<>(); en el & debe haber una clase, hay que importar
        ArrayList<Integer> lista=new ArrayList<>();
        /*
        for (int i = 3; i < 13; i++) { //el solo for sirve para no tener que meter  lista.add(); 10 veces
          //lista.add(23);//mete por el final colas de supermercado y todos son 23
       lista.add(i);//añade las i
      
        }
       
        lista.add(5,13);//mueve el resto hacia la derecha sumando 1, es decir no sustituye, añade
        lista.add(50);
       /*
        int tam=lista.size();//es el .lenght, metelo en una variable porque sino peta cuando hay muchas cosas y ponerlo en un for es una salvajada
        for (int i = 0; i < tam; i++) {
            System.out.println(lista.get(i));//consulta, si ese objeto no tiene un ToString se va a la m¡erda
            
        }
          System.out.println(lista);*/
        
            

      /*  lista.set(6,13);//este SI sustituye
        lista.remove(11);//quita la POSICION 11
        lista.remove((Integer)11);//quita el numero 11
  // boolean borrar=lista.remove((Integer)11);  //realemte es un boleeano y se puede ver, sino lo guardas en una variable, se pierde el boolean peros si se aplican esos cambios
        //System.out.println(borrar);
        if (lista.isEmpty()) {//devueleve si la lista esta vacia... sino no sale
            System.out.println("la lista esta vacia");
        }
         if (lista.contains(13)) {//devueleve si esta en la lista 
            System.out.println("el elemento esta en la lista");
        }
         //cuidado con la diferencia en el objeto con el casteo o un numero int
         
            System.out.println(lista.indexOf((Integer)3));//muestra la primera aparicion
            
            lista.clear();//se carga los cajones y se queda vacia
            

        System.out.println(lista);
        
       Arma miarma=new Arma("miarma", 10, 10);
       
         ArrayList<Guerrero> torneo =new ArrayList<>();
         torneo.add(new Guerrero("juan", 50, 150, 300, true, miarma));
         
         System.out.println(torneo);//deberia salir el ToString
*/
      
       for (int i = 0; i < 10; i++) { 
                lista.add(i);
       }
       System.out.println(lista);
       
     /*  int tam=lista.size();
        for (int i = 0; i < tam; i++) { 
               System.out.println( lista.get(i));
       }
       esto es lo mismo que el for de abajo
       */
     
     for(Integer elemento: lista){// es mucho mas sencillo pero solo con i++
         System.out.println(elemento);
         
     }
    }
    
}

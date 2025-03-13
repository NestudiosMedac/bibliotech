package HEROE;

import java.util.Scanner;

public class testHeroe {
 
    public static void main(String[] args) {
       
        int isma = 7;
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a crear un Super Heroe...");
        
        System.out.print("Introduce nombre: ");
        String anselmo = teclado.next();
        System.out.print("Introduce edad: ");
        int edad = teclado.nextInt();
        System.out.print("Introduce altura: ");
        double alto = teclado.nextDouble();
        
        System.out.print("Introduce sexo (M/F): ");
        String sexo = teclado.next();
        boolean res = true;
        if (sexo.equalsIgnoreCase("M")){
            res = false;
        }
        
        Heroe otro = new Heroe(alto,edad,anselmo,res);
       */
        //CREACION de un objeto
        Heroe popote = new Heroe(1.80,19,"Super Isma",false);
        Heroe agua= new Heroe(popote);// pones el heroe que quieres copiar
        
     //   agua=popote;//cuidado con esto, cuando clonas el nombre por ejemplo y cambias algo de agua tambien afecta a popote, pasa con String
           System.out.println(popote);
             System.out.println(agua);
        agua.nombre="patata";
          System.out.println(popote);
        System.out.println(agua);
        //por esto se usa un constructor de copia, y se borra agua=popote;
        
        
        //Consultar y cambiar atributos => NOTACION PUNTO
        /*
        System.out.println("Nombre: "+popote.nombre);
        System.out.println("Altura: "+popote.altura);
        System.out.println("Edad: "+popote.edad);
        System.out.print("Sexo: ");
        if (popote.sexo == true){
            System.out.println("Es chica.");
        }
        else{
            System.out.println("ES chico.");
        }
        */
        
        System.out.println(agua.energia);
        
       
        agua.pelear();
        System.out.println(agua.energia);
        agua.pelear();
        System.out.println(agua.energia);
        agua.pelear();
        System.out.println(agua.energia);
        agua.pelear();
        
        
        
       
        
        
        
        System.out.println(agua.energia);
        
        
        
        
        
        /*
        System.out.println("Nombre: "+otro.nombre);
        System.out.println("Altura: "+otro.altura);
        System.out.println("Edad: "+otro.edad);
        System.out.print("Sexo: ");
        if (otro.sexo == true){
            System.out.println("Es chica.");
        }
        else{
            System.out.println("ES chico.");
        }
        
        */
        
    }

}

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 * Una persona debe tener nombre (cadena), edad (entero mayor a 0), sexo (‘M’ o
 * ‘F’) y país (España, Bulgaria, Colombia o Venezuela).
 *
 * @author nuria
 */
public class Persona {

   private String nombre;
   private int edad;
   private boolean sexo;//true masc/false fem, no pide que se muestre
   private String pais;
   private boolean mayor;
   
   private String paises[]={"España","Colombia", "venezula"};

    public Persona(String nombre, int edad, boolean sexo, String pais) {
        this.nombre = nombre;
        this.edad = edad;
        if(edad<0){
            edad=18;
        }
        this.sexo = sexo;
        this.pais = pais;
        /*if (no pais esta en array paises){//this.comprobarpais
    pais="España";
    }*/
    }

 public String saludar(String nombre, String pais) {//el cual debe devolver (que no mostrar) un saludo de la forma: “Hola! Me llamo nombre y soy de pais”
       String res="Hola! Me llamo "+this.nombre + " y soy de "+this.pais;
        return res;
}
  public String saludar(int opcion) {//el cual debe devolver (que no mostrar) un saludo de la forma: “Hola! Me llamo nombre y soy de pais”
  String res="";  
      switch (opcion) {
          case 1: res="Feliz navidad! Me llamo "+this.nombre + " y soy de "+this.pais+" tengo "+this.edad+" ahos.";

              break;
              case 2: res="Saludo 2.";

              break;
              case 3: res="Saludo 3";

              break;
      }
          return res;      
}
  public void mostrarDatos( String nombre,int edad, String sexo, String pais) {//muestra por pantalla de forma ordenada los datos de la persona.
  /*System.out.println("Nombre:"+this.nombre);
    System.out.println("Edad:"+this.edad);
      System.out.println("Sexo:"+sexo);
        System.out.println("Pais:"+ this.pais);
        */
  String res=this.toString();
      System.out.println(res);
          
    }

   private void EsMayorEdad(int edad) {//devuelve un booleano que indica si la persona es mayor de edad o no
       boolean mayor=true;
        if (this.edad <18) {//preguntar 
            mayor = true;
        }else{
            mayor =false;
            }
        }
    
        private void EsChicoChica(String sexo) {//devuelve un booleano que indica si la persona es chico o chica
        if (sexo.equalsIgnoreCase("chica")) {//preguntar jaime
           this.sexo = false;
        }else{
           this.sexo=true;
            }
        }



    public String toString() {//método para devolver la información de una persona. Tipo test
        String res="";
        res += "Nombre:\n"+this.nombre+"\n";
        res += "Edad:\n"+this.edad+"\n";
        res += "Sexo:\n"+sexo+"\n";
        res += "Pais:\n"+this.pais+"\n";
        return res;
    }

    }

/*  */

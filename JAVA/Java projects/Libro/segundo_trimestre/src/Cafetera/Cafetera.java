/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafetera;
//import Coche.Coche;
/**
 *
 * @author nuria
 */
public class Cafetera {
   private int capacidadMaxima;
   private int cantidadActual;
  
 public Cafetera (int capacidadMaxima, int cantidadActual){
     this.capacidadMaxima=1000;
     this.cantidadActual=0;
     
 
     
}
 //sobrecarga de cafetera
 public Cafetera (int cantidadMaxi){
     this.capacidadMaxima=cantidadMaxi;
     this.cantidadActual=0;
  
}//Fin de sobrecarga
 
 public void echarCafe(int cafe){
     this.cantidadActual+=cafe;
     if(this.cantidadActual>=this.capacidadMaxima){
         System.out.println("No puedes echar mas cafe del limite, se desechara el resto");
         this.cantidadActual=this.capacidadMaxima;//llama a llenar cafetera
     }else{
         System.out.println("El cafe ha sido echado");
     }
     
 
 }
 public void servirTaza(int taza){//done
     if(this.cantidadActual<taza){
         System.out.println("La taza se quedara vacia, no se va a llenar.");
     }else{
          System.out.println("La taza ha sido llenada.");
         this.cantidadActual=this.cantidadActual-taza;
     }     
  }
  public void llenarCafetera(){//done
      this.cantidadActual=capacidadMaxima;
      System.out.println("La cafetera se ha llenado al maximo");//no es necesario
  }
  public void vaciarCafetera(){//done
      this.cantidadActual=0;
      System.out.println("La cafetera se ha vaciado");//no es necesario
  }
  
   public void cantidadCafe(){//done
     System.out.println("Queda "+this.cantidadActual+" cc de cafe en la cafetera.");
  }
  }


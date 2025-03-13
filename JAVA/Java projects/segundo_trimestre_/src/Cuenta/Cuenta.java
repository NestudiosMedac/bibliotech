/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuenta;

/**
 *
 * @author Nuria
 */
public class Cuenta {
  private String titular;
  private int cant;
private int CANTMAXIMA=9999;





    public String getTitular() {
        return titular;
    }
     public void setTitular(String titular) {
        this.titular = titular;
    }


    public int getCant() {
        return cant;
    }

   
    public void setCant(int cant) {
        this.cant = cant;
    }
  
    public void ingresar(int dinero){
        if(dinero>0){
            this.cant+= dinero;
        }else{
            System.out.println("No se han efectuado cambios");
        }
    }
    
    public void retirar(int restarDinero){
      if(restarDinero<this.cant && this.cant>CANTMAXIMA){
          this.cant-=restarDinero;
      }else{
          System.out.print("Error");
      }
    }

  
    public String toString() {
        return "Esta cuenta pertenece a" + this.titular + " y posee actualmente una cantidad de " + this.cant+ " de euros";
    }
    
    
  
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bala;

/**
 *
 * @author nuria
 */
public class Bala {
    
    private int calibre, longitud;
    
    public Bala(int cal, int lng){
        this.calibre=cal;
         this.longitud=lng;
    }
     public Bala(){
         this.calibre=9;
         this.longitud=40;
    }

     
     
    public String toString() {
        return "Bala{" + "calibre=" + this.calibre + "mm, longitud=" + this.longitud + "mm}";
    }
    
     
    
}

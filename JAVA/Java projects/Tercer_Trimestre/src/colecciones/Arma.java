/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

/**
 *
 * @author nuria
 */
public class Arma {

    private String nombre;
    private int resistencia;
    private int poder;
    
    private int nivel;
    
    
    
    public Arma(String nombre, int resistencia, int poder) {
        this.nombre = nombre;
        this.resistencia = resistencia;
        this.poder = poder;
        this.nivel=1;
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public int getResistencia() {
        return resistencia;
    }
    
  public void SubirNivelArma(){
        this.nivel++;
       this.resistencia+=2;
            this.poder+=1;
        
     }
    
      public void RestarArma(){
        this.resistencia--;
        if (resistencia<=0){
            this.poder=0;
        }
     }
    
        public String ToString() {
        String res = "";
        res += this.nombre + "\n";
        res += this.resistencia + "\n";
         res += this.poder + "\n";
        return res;
        }
}

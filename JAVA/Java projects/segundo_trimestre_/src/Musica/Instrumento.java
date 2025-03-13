/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musica;

/**
 *
 * @author Nuria
 */
public abstract class Instrumento {
    String marca;
    String fecha;//mes y año
    Partitura Partitura;
    boolean tocando;
    boolean roto;
    public Instrumento(String marca, String fecha, Partitura partiture ) {
        this.fecha=fecha;
        this.marca=marca;
        this.Partitura=partiture;
        this.tocando=false;
        this.roto=false;
    }
    
    public Instrumento(String marca, String fecha){
         this.fecha=fecha;
        this.marca=marca;
        this.tocando=false;
        this.roto=false;
        
        int aleaNotas=(int)(Math.random()*91+10);
        for (int i = 0; i < aleaNotas; i++) {
            this.aniadirNota();
        }
}
public boolean aniadirNota(){
String valores[]={"do","re","mi","fa","sol","la","si",};
        this.Partitura=new Partitura("desconocido", "desconocido");
        
        int aleaValor=(int)(Math.random()*7);
        int aleaDur=(int)(Math.random()*5+1);
       return this.Partitura.addNota(new Nota(valores[aleaValor], aleaDur));
         }

public abstract String tocarPartitura();
public abstract void afinar();
  public void pararTocar(){
      if(this.tocando){
          this.tocando=false;
      }
  }  
}

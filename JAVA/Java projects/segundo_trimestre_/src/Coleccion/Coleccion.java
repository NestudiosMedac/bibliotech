package Coleccion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nuria
 */
public abstract class Coleccion {
    
 private int lista[];
 private int contador;
 
 public Coleccion( int TAM){
 this.lista=new int[TAM];
}
 

public Coleccion(int num, int TAM){
 
 if (num<=0){
   this.lista=new int[TAM];  
 }else{
     this.lista=new int[num];
 }
     
}

public void getElementos(){
    System.out.println(lista.length);
}
public void getElemento(int pos){
    if(pos>lista.length&&pos<lista.length){
    System.out.println(lista[pos]);
        
    }else{
        System.out.println("-1");
    }
}
public void sinElementos(){
   boolean vacia=false;
   
  
}
public void aniadir(int elemento){}
public void eliminar(int elemento){}
public void contiene(int elemento){}



    @Override
    public String toString() {
       String res="";
       res+="[";
        for (int i = 0; i < lista.length; i++) {
            if (i==lista.length-1 ){
                 res+=lista[i]+"";
            }else{
             res+=lista[i]+",";
        }
         res+="]";
      
       return res;
       
    }





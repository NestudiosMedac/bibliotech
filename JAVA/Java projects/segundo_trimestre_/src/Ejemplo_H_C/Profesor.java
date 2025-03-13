/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_H_C;

/**
 *
 * @author nuria
 */
public class Profesor {
     private String nombre;
     private boolean sexo;
     //1)tengo una (o varias) propiedades a usar
     /*private*/ Asignatura materia;
    /// private Asignatura materia[];
     public Profesor(String nombre, boolean sexo/*,int tam*/){
         this.nombre=nombre;
         this.sexo=sexo;
         this.materia=null;//necesita un objeto pero esta vacia, null=vacio, nuca debe salir
     }
     
     //2)Pueden pasarme un objeto ya creado por los parametros del constructor...
     //4)Asegurarme de que cuando tranjo con un ogjeto exista
     public Profesor(String nombre, boolean sexo, Asignatura primera){//sobrecarga del constructor
         this.nombre=nombre;
         this.sexo=sexo;
         this.materia=primera;
     }
     //3)Utilizo la propiedad Asignatura (que tiene un objeto) como una propiedad más en mi código
     public String infoAsignatura(){
     String res="La asignatura de este profe es:";
     if(this.materia !=null){
     res+=this.materia.nombre;//esta null, y da un error, hay que poner una condicion para corregirlo
     res+="<>"+this.materia.nhoras;
    
             }else{
         res+="este profesor no tiene asignatura";
     }
      return res;
    }
     
       public void darBaja(){
         this.materia=null;
     }
     
     public void asignarAsignatura(Asignatura otra){
         
     }
     
     public String getNombre(){
         return this.nombre;
     }
//...o cualquier otro metodo
    public void setAsignatura(Asignatura otra) {
        this.materia = otra;
    }
     

    public String toString() {
        return this.nombre+": "+ this.materia;
    }
     
     
}

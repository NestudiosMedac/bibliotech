/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_H_C;

/**
 *
 * @author nuria
 * jaime se ha ahorrado los get y los set para explicar más rapido
 */
public class Asignatura {
    //Agregacion
   /* private*/ int nhoras;
 /* private*/  String nombre;
    
    public Asignatura(String n, int h){
        this.nombre=n;
        this.nhoras=h;
    }
    
    public String getNombre(){
         return this.nombre;
     }
    public String ToString(){
        return this.nombre+"("+this.nhoras+" horas)";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.Act110;

/**
 *
 * @author nuria
 */
public class WaterOnTheLimitExeption extends Exception {

    public WaterOnTheLimitExeption() {
        super();//si no pones el extends esto no pita porque TODAS las clases heredan de la clase Object que tiene un constructor vacio
    }
      public WaterOnTheLimitExeption(String mns) {//para crear el mensaje
        super(mns);
    }
    
}

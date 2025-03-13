/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo_H_C;

/**
 *
 * @author nuria
 */
public class testProfesor {
//es una relacion de agregación(el new va a ha esatr en el main),y si hay composicion (es muy probable que haya array)
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Asignatura a1=new Asignatura("LLMM",128);
        Asignatura a2=new Asignatura ("Entornos", 63);
        
        Profesor p1 =new Profesor("Vicente", true);
         Profesor p2 =new Profesor("Aurelio", true, a1);
         
       // System.out.println(p2.materia.nombre);//System.out.println(p2.getmateria().nombre)//al nombre le pones otro get si este es priv
     
      System.out.println(p1);// esto da un error si no se pone su condicion
       System.out.println(p2);
        
    }
    
}

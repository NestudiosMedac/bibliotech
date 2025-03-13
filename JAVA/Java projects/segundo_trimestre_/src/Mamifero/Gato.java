/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mamifero;

/**
 *
 * @author nuria
 */
public class Gato extends Mamifero{
    String color;
    boolean castrado;
    public Gato (String colour, double peso, int np, int vm){
        super(np, peso, vm);
        this.color=colour;
        this.castrado=false;
    }
        @Override
    public void comunicarse(){ 
        System.out.println("Miau");
    }
    
    @Override
    public String toString(){
        String res= "Gatete: ";
        res+=super.toString()+"\n";
        res+="de color:"+this.color+"\n";
        if(this.castrado){
            res+="Esta castrado";
        }else{
            res+="No esta castrado";

        }
        return res;
    }

}
    

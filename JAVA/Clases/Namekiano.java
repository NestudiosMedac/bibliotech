/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gomez_Nuria;

/**
 *
 * @author nuria
 */
public class Namekiano extends Ser{
   protected String clan;
//arreglar
    public Namekiano(String clan, String name, int edad) {//(int)(Math.random()*(max-min+1)+min);
        super(name, edad);
        this.clan = clan;
        this.ataque=(int)(Math.random()*(20-10+1)+10);
        this.defensa=(int)(Math.random()*(35-25+1)+25);
        this.ki=this.getEdad()+150;
        calcularNivel();
        this.vida= (int)(Math.random()*(1000-((this.getEdad())*3)+1)+this.getEdad());
    }
   

    
    public void absorber(Namekiano absorbido){
        this.ki+=absorbido.ki;
        this.nivel+=10;
        this.ataque+=absorbido.ataque/2.5;
        this.defensa+=absorbido.defensa/2.25;
    }
    
    @Override
    public String hablar(){
    return "Soy un namekiano y no me gusta que invadan mi planeta";
    }
    
    @Override
    public void entrenar(){
        this.ataque+=2;
        this.defensa+=2;
        this.ki+=1;
    }
    

    protected void calcularNivel(){
        this.nivel=(this.ataque+ this.defensa)/3;
        
    }

    @Override
    public String toString() {
        return "Namekiano ["+this.getNombre()+", "+this.getEdad()+", "
        +this.ataque+", "+this.defensa+", "+this.vida+", "+this.ki+"]";
    }
    
    
}

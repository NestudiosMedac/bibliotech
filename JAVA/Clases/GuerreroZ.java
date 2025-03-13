/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gomez_Nuria;

/**
 *
 * @author nuria
 */
public class GuerreroZ extends Humano{
    protected String escuela;
    protected boolean ocultando;//F-sin ocultar T-ocultando
    private int kio, fuer, def;//son variables para ocultar a los otros atributos. Son de apoyo

    public GuerreroZ(String name, int edad,String escuela) {//(int)(Math.random()*(max-min+1)+min);
         super(name, edad);
         this.escuela = escuela;
         this.ocultando=false;
         this.vida=(int)(Math.random()*(740-((this.getEdad())*3)+1)+this.getEdad());
         this.ataque=(int)(Math.random()*(20-8+1)+8);
          this.defensa=(int)(Math.random()*(30-20+1)+20);
          this.ki=this.getEdad()+100;
          calcularNivel();
          
          

    }
   
    
    public void ocultar(){// he asignado el valor de antes a la variable que cree de apoyo
       
        kio+=this.ki;
        fuer+=this.ataque;
        def+=this.defensa;
        
        this.ki=this.ki/=2;
       this.ataque=this.ataque%this.nivel;
       this.defensa=this.defensa%this.nivel;
            
            
           
        }
    
    
    public void liberar(){//vuelve a los valores
        this.ki=kio;
    this.ataque=fuer;
    this.defensa=def;

}
    
    
    @Override
    public String hablar(){
        return "Soy un humano y confío en mis companeros";
    }
    
    @Override
    public void entrenar(){
        this.ataque+=3;
        this.defensa++;
        this.ki++;
    }
    
    protected void calcularNivel(){
    this.nivel=(this.ataque+ this.defensa)/3;
    }

    @Override
    public String toString() {
       String res="";
        res+=super.toString()+"\n";
        res+="Guerrero de"+ this.escuela+"["+this.ataque+","+this.defensa+
                ", "+this.ki+"]";
        if(!this.ocultando){
            res+="Se esta ocultando";
            
        }else{
            res+="No se esta ocultando";
        }
        return res;
    }
    
    
    
    
}

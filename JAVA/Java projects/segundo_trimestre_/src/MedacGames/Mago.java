/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MedacGames;

/**
 *
 * @author Nuria
 */
public class Mago extends Heroe{
int vidaActual;
    public Mago(String name) {//(int)(Math.random()*(max-min+1)+min)
        super(name);
        this.inteligencia=(int)(Math.random()*(20-10+1)+10);
        this.fuerza=(int)(Math.random()*(8-3+1)+3);
        this.muerto=false;
        this.destreza=(int)(Math.random()*(12-5+1)+5);
        this.vida=(int)(Math.random()*(10-2+1)+2);
        this.vidaActual=this.vida;
    }
    public void curarse(){
    if(this.vidaActual<this.vida){
        this.vida+=3;
        System.out.println(this.nombre+" se ha curado 3 puntos.");
    }else{
        System.out.println(this.nombre+" no se puede curar mas.");
    }
    }
    @Override
    public void atacar(Heroe defensor){
        if(defensor.esquivar()){
            System.out.println("No se ha comido ninguna ostia");
        }else{
            defensor.vida-=this.fuerza/2;
        }
    }
    
     @Override
    public boolean esquivar( ){
        boolean esquiv=true;
        int probability=(int)(Math.random()*(40-2+1)+2);
        if(probability>this.destreza){
            System.out.println(this.nombre+" sa matao en vez de esquivar bien");
            return esquiv=false;
        }else{
            System.out.println(this.nombre+" ha esquivado");
            return esquiv;
        }
    }
}

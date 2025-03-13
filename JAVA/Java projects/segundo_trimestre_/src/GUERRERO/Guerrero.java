/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUERRERO;

/**
Agregacion
 *
 * @author nuria
 */
public class Guerrero {

    private String nombre;
    private int salud;
    private int ataque;
    private int escudo;
    boolean muerto;
    private int MAXSALUD = 100;
    Arma miarma;
    int nivel;
    int nivelActual;
    int nivelSiguiente;
    int experienciaActual;

    public Guerrero(String nombre, int salud, int ataque, int escudo, boolean vivo, Arma miarma) {//constructor por defecto
        this.nombre = nombre;
        this.salud = MAXSALUD;
        this.ataque = ataque;
        this.miarma = miarma;
        
        
        this.muerto= false;
        this.nivel=1;
        this.nivelActual=0;
        this.nivelSiguiente=(int)Math.ceil(this.nivel*10+this.nivel*1.5);
    }

    public void atacar( Guerrero defensor) {
        if(!this.muerto){//no poner == más que quita puntos
            System.out.println( this.ataque + this.miarma.getPoder());// hacer get 
            int ataqueTotal=this.ataque+this.miarma.getPoder();// hacer get 
            int danio= ataqueTotal-defensor.escudo;//esta dentro de la misma clase
           
            if(danio<0){
                danio=1;//como enfe da pena, vamos a quitar 1 como minimo
                 System.out.println(this.nombre+"le ha dado un tortazo de "+danio+" a "+defensor.nombre);
            }
            defensor.salud-=danio;
            this.miarma.RestarArma();//se llama igual que los get
            ComprobarMuerte(defensor);
            if(this.miarma.getResistencia()>0){
                ataqueTotal=this.ataque+this.miarma.getPoder();
                this.experienciaActual+=3;
                 System.out.println("CON arma");
            }else{
                ataqueTotal=this.ataque;
                this.experienciaActual+=5;
                 System.out.println("SIN arma");
            }
        }else{
            System.out.println("Esta morido");
        }
    }
    
  

    private void ComprobarMuerte(Guerrero defensor) {
        if (this.salud <= 0) {
            muerto = true;
            salud=0;
        }
        
        if (defensor.salud <= 0) {
            defensor.muerto = true;
            defensor.salud=0;
        }
    }
    
    public boolean Subir(){//mejorar
        if(this.experienciaActual>=this.nivelSiguiente){
            return true;
        }
        return false;
         
     }
    
    public void SubirNivel(){
       this.nivelActual++;
       this.experienciaActual=0;
       this.nivelSiguiente=(int)Math.ceil(this.nivel*10+this.nivel*1.5);
       this.escudo++;
       this.MAXSALUD+=10;
       this.salud=this.MAXSALUD;//extra porque en algunos juegos si subes de subir de nivel pues tambien
        System.out.println(this.nombre+"ha subido de nivel");
         
     }
//hacer k
    
    public void ganarExp(){
       
    }
    
     public void mejorarArma(String nombre){
         if(this.miarma.getNombre().equalsIgnoreCase(nombre)){
             this.miarma.SubirNivelArma();   
         }
     }

    public String ToString() {
        String res = "";
        res += this.nombre + "\n";
        res += this.salud + "\n";
        res += this.ataque + "\n";
        res += this.escudo + "\n";
        return res;
    }

}

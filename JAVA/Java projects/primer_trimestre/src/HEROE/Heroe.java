
package HEROE;
// ej de importa: import Pelota.Pelota;
public class Heroe {
    
    //Atributos de clase
  /*private*/String nombre;
  private  double altura;
  private  int edad;
  private  boolean sexo; //true - femenino ; false - masculino
    
    //Atributos propios para funcionar
    boolean vida; //true esta viv@ , false esta muert@
    int energia; //controla los puntos de vida del heroe
    final int MAXENERGY = 100;
    
    
    //Metodo constructor
    public Heroe(double altura,int edad,String nombre,boolean sexo){    
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.vida = true; //nace vivo
        this.energia = MAXENERGY;
    }
    
    
    //Constructor de copia
    public Heroe(Heroe origen){//lo de origen da lo mismo    
        this.nombre = origen.nombre;
        this.edad = origen.edad;
        this.sexo = origen.sexo;
        this.altura = origen.altura;
        this.vida = origen.vida;
        this.energia = origen.energia;
    }//no haria falta hacer ni un get ni un set. Tamb hay video y cae en la practica si o si.
    
    
    //Metodos de clase - ACCIONES
    public void volar(){
        if (this.vida){
            System.out.println(this.nombre+" está volando!!");
            this.energia -= 10;
            this.comprobarMuerte();
        }
        else{
           System.out.println(this.nombre+" está muerto."); 
        } 
    }
    
    public void dormir(){
        if (this.vida){
            System.out.println(this.nombre+" está durmiendo.");
            this.energia +=20;
            if(this.energia > this.MAXENERGY){
                this.energia = this.MAXENERGY;
            }
        }
         else{
           System.out.println(this.nombre+" está muerto."); 
        }
    }
    
    public void pelear(){
        if (this.vida){
            if (this.energia >= 30){
                System.out.println(this.nombre+" se está dando hostias con Evilcente");
                this.energia -= 30;
                this.comprobarMuerte();
            }
            else{
                System.out.println(this.nombre+" no tiene energia suficiente para pelear");
            }
        }
        else{
           System.out.println(this.nombre+" está muerto."); 
        }
    }
    
    public void comprobarMuerte(){
        if (this.energia <=0){
            this.vida = false;
            System.out.println(this.nombre+" ha muerto.");
        }
    }
    
    //metofos GETTERS y SETTERS (GET y SET)
    //NO INSERTES CODIGO SINO SABES
    public void setEdad(int nuevaEdad) {//Set sirve de filtro de condiciones para quien quiera cambiar un atributo privado. Recibe pero devuelve
        this.edad=nuevaEdad;
        if(this.edad>50){//bajo mis reglas
            this.edad=50;
        }
    }
    
    public int getEdad() {//get te permite mostrar o consultar un dato privado en cualquier archivo.Tambien se pueden establecer condiciones para filtrar pero pa que?. Devuelve pero no recibe. Mira bien que el tipo sea igual.
       return this.edad; 
    }
  
}

/* 
public class Cafetera {
   private int capacidadMaxima;
   private int cantidadActual;
  
 public Cafetera (int capacidadMaxima, int cantidadActual){
     this.capacidadMaxima=1000;
     this.cantidadActual=0;
     
 
     
}
 //sobrecarga de cafetera
 public Cafetera (int cantidadMaxi){
     this.capacidadMaxima=cantidadMaxi;
     this.cantidadActual=0; */

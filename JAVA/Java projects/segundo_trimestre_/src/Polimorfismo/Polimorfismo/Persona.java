
package POO.Polimorfismo;


public class Persona {
    protected String nombre;
    protected int edad;
    
    
    
    public Persona(String n, int e){
        this.nombre = n;
        this.edad = e;
    }
    public void hablar(){
        System.out.println("Soy una persona");
    }
    
    public String saludar(){
        return "Hola!! Soy "+this.nombre+"!!";
    }
 
    @Override
    public String toString() {
      String res="Soy una Persona con nombre:" + this.nombre + " y edad:" + this.edad;   
      return res;
    }
}

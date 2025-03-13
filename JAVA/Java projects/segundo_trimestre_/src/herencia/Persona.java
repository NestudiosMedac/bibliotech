
package herencia;


public class Persona {
    
    String nombre;
    int edad;
    double peso;

    public Persona(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona() {
        this.nombre="Doctora china";
        this.edad=28;
        this.peso=34.0;
        
        
    }
    
    public void mostrarInforPantalla(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Peso: "+this.peso);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }


    
    
    
}

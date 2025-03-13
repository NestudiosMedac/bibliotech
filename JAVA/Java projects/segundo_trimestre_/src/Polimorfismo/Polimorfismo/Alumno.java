

package POO.Polimorfismo;


public class Alumno extends Persona{
    String instituto;
    int numMatricula;

    public Alumno(String instituto, int numMatricula, String nombre, int edad) {
        super(nombre, edad);
        this.instituto = instituto;
        this.numMatricula = numMatricula;
    }
    

    //metodo propio
    public void copiar(){
        System.out.println("Se la he colado al profe!!!");
    }
    
    @Override
    public String toString() {
        return "Soy un Alumno con nombre:" + this.nombre + ",edad:" + this.edad+",matricula:" + this.numMatricula + "e instituto:" + this.instituto;
    }

}

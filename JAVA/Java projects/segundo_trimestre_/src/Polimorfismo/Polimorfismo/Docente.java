

package POO.Polimorfismo;


public class Docente extends Persona{
    protected String DNI;
    protected String instituto;

    public Docente(String d, String i, String n, int e){
        super(n, e);
        this.DNI = d;
        this.instituto = i;
    }
    
    @Override
    public void hablar(){
        System.out.println("Soy un docente");
    }
    
    //Metodo propio
    public void suspender(int num){
        System.out.println("Me he cargado a "+num+" alumn@s");
    }

    @Override
    public String toString() {
        return "Soy un Docente con nombre:" + this.nombre + ",edad:" + this.edad+",DNI:" + this.DNI + "e instituto:" + this.instituto;
    }  
}

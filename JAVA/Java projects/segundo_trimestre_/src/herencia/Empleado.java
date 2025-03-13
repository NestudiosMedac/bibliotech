
package herencia;


public class Empleado extends Persona{
    double sueldo;
    
    public Empleado(){
        //this hace referencia al archivo donde estoy y "super" me da la referencia del padre.
        //lo primero que se crea en el constructor es la llamda al padre con super(tal,tal,tal);
        super();
    }
    public Empleado(String nombre, int edad, double peso,double sueldo){// lo de dentro de los parentesis se llaman parametros
        super(nombre, edad, peso);
        this.sueldo=sueldo;
    }
    
    public String toStringPadre(){
        
        return super.toString();
        
    }
    
    
    @Override
    public String toString(){
        String res=super.toString()+"Sueldo"+this.sueldo;
        return res;
        
    }
}

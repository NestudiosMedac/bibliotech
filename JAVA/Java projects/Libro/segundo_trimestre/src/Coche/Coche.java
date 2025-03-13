package curso.Trimestre1.POO;

public class Coche {

    String color;
    double anchura;
    double altura;
    int npuertas;
    int gasolina;
    String nombre;
    
    final int RUEDAS = 4;
    final int GASMAX = 50;
    
    boolean encendido;//true encendido - false apagado

    public Coche(String col, double anc, double alt, int puertas,String nom) {
        this.color = col;
        this.anchura = anc;
        this.altura = alt;
        this.npuertas = puertas;
        this.nombre = nom;
        
        this.gasolina = GASMAX;
        this.encendido = false;
    }

    public void encender() {
        if (this.encendido == false) {
            this.encendido = true;
            gasolina -= 5;
            System.out.println("Se ha encendido!!");
        } else {
            System.out.println("Ya estaba encendido!!");
        }
    }

    public void apagar() {
        if (this.encendido == true) {
            this.encendido = false;
            System.out.println("Se ha apagado!!");
        } else {
            System.out.println("Ya estaba apagado!!");
        }
    }

    public void desplazarse() {
        if (this.encendido == true) {
            gasolina -= 20;
            System.out.println("Se esta desplazando..");
        } else {
            System.out.println("No puede desplazarse, esta apagado!!");
        }
    }
    
    public void echarGasolina(int cantidadGas) {
        this.apagar();
        this.gasolina += cantidadGas;
        if (this.gasolina > GASMAX) {
            this.gasolina = GASMAX;
        }
    }
    
    public void pintar(String color_pedido) {
        this.color = color_pedido;
    }
    
    @Override
    public String toString(){
        String res = "";

        res += "Las características del coche "+this.nombre+"\n"; 
        res += "Color: "+this.color+"\n";
        res += "Altura: "+this.altura+"\n";
        res += "Anchura: "+this.anchura+"\n";
        res += "Nº Puertas: "+this.npuertas+"\n";
        res += "Gasolina: "+this.gasolina+"L.\n";
        return res;
    }
}

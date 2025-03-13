
package curso.Trimestre1.POO;


public class testCoche {

    public static void main(String[] args) {
        Coche lambo = new Coche("blanco",1.60,1.70,4,"Terreneitor");
        
        lambo.desplazarse();
        System.out.println(lambo);
        lambo.encender();
        lambo.desplazarse();
        System.out.println(lambo.gasolina);
        lambo.echarGasolina(25);
        System.out.println(lambo.gasolina);
        lambo.apagar();
        lambo.pintar("caca");
        System.out.println(lambo);
    }

}

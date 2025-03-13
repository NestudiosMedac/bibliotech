
package POO.Polimorfismo;


public class testPolimorfismo {

    public static void main(String[] args) {
        
     Persona carlos = new Persona("Carlos", 23);
     Docente dani = new Docente("34567890H", "MEDAC NOVA", "Blandengue", 30);
     Docente salva = new Docente("67123567D", "MEDAC NOVA", "Vivo en mi mundo", 53);
     Alumno santiago = new Alumno("Arkham", 0001, "Enfedake +3", 20);
     Alumno luis = new Alumno("Cesur", 0012, "D&DMaster", 35);
     
     
     
     Persona lista[] = new Persona[6];
     //lista[0]= carlos;
     lista[1]= dani;
     lista[2]= salva;
     lista[3]= santiago;
     lista[4]= luis;
     lista[5]= new Alumno("La Palmilla", 678, "Aurora", 16);
            
     /*
     if (lista[5] instanceof Docente){
         ((Docente)lista[5]).suspender(3);
     }
     */
     
     //((Docente)lista[5]).suspender(3);
     for (int i = 0; i < lista.length; i++) {
        //System.out.println(lista[i]);
        if (lista[i] instanceof Docente){
            //Docente tmp = (Docente)lista[i];
            //tmp.suspender(i);
            System.out.println(lista[i]);
           ((Docente)lista[i]).suspender(i);
        }
    }
    

     
    }

}

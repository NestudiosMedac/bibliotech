/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj;
/**
 *
 * @author nuria
 */
public class relojtipo {//Reloj

    int horas;
    int minutos;
    int segundos;
    boolean encendido; //true encendido,false apagado

    public relojtipo(int h, int m, int s) {
        this.horas = h;
        if ((this.horas < 0) || (this.horas > 23)) {
            this.horas = 0;
        }
        this.minutos = m;

        if ((this.minutos < 0) || (this.minutos > 59)) {
            this.minutos = 0;
        }
        this.segundos = s;
        if ((this.segundos < 0) || (this.segundos > 59)) {
            this.segundos = 0;
        }

        this.encendido = false;
        //apartado b-Métodos de clase
    }
        
    public void encenderse() {
        this.encendido=true;
        System.out.println("El reloj esta encendido");
    }

    public void apagarse() {
        this.encendido = false;
        System.out.println("El reloj esta apagado");

    }

    public void adelantarHora() {
        if(!this.encendido){
        this.horas++;
            if (this.horas==24){
             this.horas = 0;
            }
        }else{
            System.out.println("No puedo adelantar en un reloj apagado");
        }

    }
       

    public void adelantarMinutos() {
          if(!this.encendido){
        this.minutos++;
        if (this.minutos==60){
             this.minutos=0;
             this.adelantarHora();//llamas a las horas
        }
        }else{
            System.out.println("No puedo adelantar en un reloj apagado");
        }

        
    }

    public void adelantarSegundos(int cantidad) {
        if(!this.encendido){
        this.segundos+=cantidad;
        if (this.segundos>=60){
          int sobras =this.segundos/60;
          int segundosBuenos= this.segundos%60;
          //this.segundos=this.segundos%60;
           for (int i=0; i<sobras; i++){
               this.adelantarMinutos();
           }
            
        }
        }else{
            System.out.println("No puedo adelantar en un reloj apagado");
        }

    }
 //apartado c-toString
   
    public String toString(){
        String res="";
        if(!this.encendido){
            res= "El reloj está apagado";
        }else{
            res= "El reloj está encendido y son las ";
            res+= this.horas +":"+this.minutos+":"+this.segundos;
            
        }
        return res;
        }
    }


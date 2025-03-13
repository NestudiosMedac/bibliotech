/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cielo;

/**
 *
 * @author nuria
 */
public class cielo {

    private estrella sky[][];

    public cielo(int anch, int alt) { //nf,nc

        this.sky = new estrella[anch][alt];

        for (int i = 0; i < anch; i++) {//crear una bidimensional vacia
            for (int j = 0; j < alt; j++) {
                this.sky[i][j] = null;//asi se pone vacio

            }
        }
    }

    public void ponerEstrellas(int nestrellas) { //arreglado
        /*for (int i = 0; i < nestrellas; i++) {//busca un hueco
            int x = (int) (Math.random() * this.sky.length);//numero de fila
            int y = (int) (Math.random() * this.sky[0].length);//numero columna

            if (this.sky[x][y] == null) {//o poner aqui un while
                this.sky[x][y] = new estrella(x, y);
            } else {
                i--;//esto es señal de que es un while, echa para atras una. 
                //tocar la i es peligrosa y esta mal visto
            }*/
        int x, y;
        int anch = this.sky.length;//numero de fila
        int alt = this.sky[0].length;
        for (int i = 0; i < nestrellas; i++) {
            if (i < anch * alt) {
                do {
                    x = (int) (Math.random() * anch);//numero de fila
                    y = (int) (Math.random() * alt);//numero columna

                } while (this.sky[x][y] != null);

                this.sky[x][y] = new estrella(x, y);
            }
        }
    }

 
    public String toString() {
        String res="";
        for (int i = 0; i <this.sky.length ; i++) {
            for (int j = 0; j < this.sky[0].length; j++) {
            if(this.sky[i][j]!=null){
                res+=this.sky[i][j];
            }else{
                res+=" ";
            }
            }  
            res+="\n";
            }
            return res;
        }    
    

    }
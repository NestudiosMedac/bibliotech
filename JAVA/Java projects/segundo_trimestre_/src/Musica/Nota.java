/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Musica;

/**
 *
 * @author Nuria
 */
public class Nota {

    String valor;
    int segs;

    public Nota(String valor, int segs) {
        
        this.valor = valor;
        valorNota();
        this.segs = segs;
          if (this.segs <= 0) {
            throw new AssertionError();
        }

    }



    private void valorNota() {

        switch (this.valor) {
            case "do" ->
                this.valor = "do";
            case "re" ->
                this.valor = "re";
            case "mi" ->
                this.valor = "mi";
            case "fa" ->
                this.valor = "fa";
            case "sol" ->
                this.valor = "sol";
            case "la" ->
                this.valor = "la";
            case "si" ->
                this.valor = "si";
            default ->
                throw new AssertionError();
        }

    }

    @Override
    public String toString() { //return "["+this.valor+","+this.segs+"]";
        String res = "";
        res += this.valor;
        res+=",";
        res += this.segs;
        return res;
    }

}

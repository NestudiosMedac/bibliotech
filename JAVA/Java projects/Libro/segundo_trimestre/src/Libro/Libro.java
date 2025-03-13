/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

import java.util.Scanner;

/**
 *
 * @author Nuria
 */
public class Libro {
   private long ISBN;
   private String Titulo;
   private String Autor;
   private int Npag;
   Scanner teclado = new Scanner(System.in);
   
   public Libro(long ISBN, String Titulo, String Autor, int Npag){
   this.ISBN=ISBN;
   this.Titulo=Titulo;
   this.Autor=Autor;
   this.Npag=Npag;
   }
   public Libro(Libro uno){
        this.ISBN =uno.ISBN;
        this.Titulo=uno.Titulo;
        this.Autor=uno.Autor;
        this.Npag=uno.Npag;
   }
      /*public Libro(Libro dos){
        this.ISBN =dos.ISBN;
        this.Titulo=dos.Titulo;
        this.Autor=dos.Autor;
        this.Npag=dos.Npag;
   }*/

   
   public void setISBN(long newISBN) {
        this.ISBN=newISBN;
        while (this.ISBN>999999999 && this.ISBN<1){
                System.out.print("Introduce un numero válido");//MUESTRA
           this.ISBN =teclado.nextInt();
        }
    }
    
    public long getISBN() {
       return this.ISBN; 
    }
    
     public void setTitulo(String newTitulo) {
        this.Titulo=newTitulo;
           this.Titulo=teclado.next();
        }
    
    public String getTitulo(){
       return this.Titulo; 
    }


 public void setAutor(String newAutor) {
        this.Autor=newAutor;
           this.Autor=teclado.next();
        }
    
    public String getAutor(){
       return this.Autor;
}

public String toString(){//DEVUELVE
 String res="";
        res += "El libro "+this.Titulo+" con "+this.ISBN+" creado por "+this.Autor+" tiene "+this.Npag;
        return res;
}
/*private void ComprobarMayor(){//preguntar profe
if(uno.Npag>dos.Npag){
    System.out.println("El libro "+this.Titulo+" tiene mas paginas");
}else if(dos.Npag>uno.Npag){
    System.out.println("El libro "+origen.Titulo+" tiene mas paginas");
}else if(this.Npag==origen.Npag){
    System.out.println("Los libros tienen la misma cantidad de paginas ");
}
}*/
}
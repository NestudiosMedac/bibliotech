package ListaDeCadenas;

public class ListaDeCadenas {

    private String[] lista;
    private int siguientePosicion;

    // Constructor
    public ListaDeCadenas(int tamaño) {
        lista = new String[tamaño];
        for (int i = 0; i < tamaño; i++) {
            lista[i] = ""; // Rellenar con cadenas vacías
        }
        siguientePosicion = 0;
    }

    // Método para añadir un elemento a una posición vacía de la lista
    public void añadir(String elemento) {
        if (this.siguientePosicion !=1) {
            this.lista[this.siguientePosicion] = elemento;
            this.actualizarPos();
        }
    }
    
    // Actualizar array rellenando el primer hueco libre existente.
    public void actualizarPos(){
        boolean encontrado = false;
        int i = 0;
        while (i < this.lista.length && !encontrado){
            //si encuentro hueco, actualizo posicion y me salgo.
           if(this.lista[i].equals("")){
               this.siguientePosicion = i;
               encontrado = true;
           }
           i++;
        }
        //Si no he encontrado ningun hueco, la posición se pone en -1
        if (!encontrado){
            this.siguientePosicion = -1;
        }
    }

    // Método para añadir un elemento en una posición indicada
    public void añaadir(String elemento, int pos) {
        if (pos >= 0 && pos < lista.length) {
            lista[pos] = elemento;
            this.actualizarPos();
        } else {
            System.out.println("La posición indicada no existe en la lista.");
        }
    }

    // Método para obtener el tamaño de la lista
    public int tamaño() {
        return lista.length;
    }

    // Método para verificar si la lista está llena
    public boolean llena() {
        return siguientePosicion == lista.length;
    }

    // Método para verificar si la lista está vacía
    public boolean vacia() {
        return siguientePosicion == 0;
    }

    // Método para obtener un elemento en una posición indicada
    public String obtener(int pos) {
        if (pos >= 0 && pos < lista.length) {
            return lista[pos];
        } else {
            System.out.println("La posición indicada no existe en la lista.");
            return "";
        }
    }

    // Método para buscar la posición de un elemento en la lista
    public int buscar(String elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // Método para borrar todos los elementos de la lista
    public void borrar() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = "";
        }
        siguientePosicion = 0;
    }

    // Método para borrar el contenido de una posición indicada
    public void borrar(int pos) {
        if (pos >= 0 && pos < lista.length) {
            lista[pos] = "";
        } else {
            System.out.println("La posición indicada no existe en la lista.");
        }
    }

    // Método para borrar el contenido de la primera celda con un elemento dado
    public void borrar(String elemento) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equals(elemento)) {
                lista[i] = "";
                return;
            }
        }
        System.out.println("No se encontró el elemento en la lista.");
    }

    // Método para obtener un trozo de la lista
    public String[] trozo(int pos1, int pos2) {
        if (pos1 < 0 || pos2 >= lista.length || pos1 > pos2) {
            return new String[0]; // Devolver un array vacío si los argumentos no son correctos
        }

        String[] trozoLista = new String[pos2 - pos1 + 1];
        int aux = 0;
        for (int i = pos1; i <= pos2; i++) {
            trozoLista[aux] = lista[i];
            aux++;
        }
        return trozoLista;
    }
}

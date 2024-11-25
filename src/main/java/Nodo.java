public class Nodo {
    int dato;      // Dato que guarda el nodo
    Nodo siguiente; // Referencia al siguiente nodo

    // Constructor para inicializar el nodo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}


public class ListaEnlazadaSimple {
    Nodo cabeza; // nodo de la lista

    //  inicializar la lista vacía
    public ListaEnlazadaSimple() {
        this.cabeza = null;
    }

    //  insertar un nodo al inicio de la lista
    public void insertarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cabeza; // El siguiente nodo del nuevo nodo será el anterior primer nodo
        cabeza = nuevoNodo; // Actualiza la cabeza para que apunte al nuevo nodo
    }

    //  eliminar el nodo al inicio de la lista
    public void eliminarAlInicio() {
        if (cabeza != null) {
            cabeza = cabeza.siguiente; // Actualiza  al siguiente nodo
        } else {
            System.out.println("La lista está vacía.");
        }
    }

    //  imprimir la lista
    public void imprimir() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
}


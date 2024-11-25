public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        // insertar elementos
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);

        // imprimir lista
        System.out.println("Lista después de insertar elementos:");
        lista.imprimir();

        // eliminar un elemento
        lista.eliminarAlInicio();

        // imprimir lista después de eliminar
        System.out.println("Lista después de eliminar el primer elemento:");
        lista.imprimir();
    }
}
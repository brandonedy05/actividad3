import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListaEnlazadaSimpleTest {
    private ListaEnlazadaSimple lista;

    @BeforeEach
    public void setUp() {
        lista = new ListaEnlazadaSimple(); // Inicialización de la lista antes de cada prueba
    }

    @Test
    public void testInsertarAlInicio() {
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);

        // Verificar que el primer elemento sea 30
        assertEquals(30, lista.cabeza.dato);
    }

    @Test
    public void testEliminarAlInicio() {
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);

        lista.eliminarAlInicio();

        // Verificar que el primer elemento sea 10
        assertEquals(10, lista.cabeza.dato);
    }

    @Test
    public void testEliminarAlInicioListaVacia() {
        lista.eliminarAlInicio();
        // Verificar que la lista sigue vacía (cabeza debe ser null)
        assertNull(lista.cabeza);
    }
}

# actividad3
Creado para actividad #3

# Implementación de una Lista Enlazada Simple en Java
## Descripción de la Estructura de la Lista Enlazada
La implementación de la lista enlazada simple consta de dos clases principales:
1. **Clase Nodo**:
   - La clase `Nodo` tiene dos atributos:
     - `dato`: Almacena el valor del nodo, que es de tipo `int`.
     - `siguiente`: Es una referencia al siguiente nodo de la lista, que inicialmente es `null`.
   - Esta clase representa los elementos de la lista.
2. **Clase ListaEnlazadaSimple**:
   - La clase `ListaEnlazadaSimple` contiene un atributo `cabeza`, que es la referencia al primer nodo de la lista.
   - Métodos principales:
     - `insertarAlInicio(int dato)`: Inserta un nuevo nodo con el valor `dato` al inicio de la lista.
     - `eliminarAlInicio()`: Elimina el primer nodo de la lista.
     - Otros métodos adicionales pueden ser agregados, como insertar en posiciones específicas, eliminar nodos por valor, etc.
La estructura básica de la lista enlazada permite insertar y eliminar nodos de manera eficiente, con complejidad O(1) para las operaciones en el inicio de la lista.
---
## Instrucciones para Compilar y Ejecutar el Código
### Requisitos previos:
- Tener **Java** instalado en tu sistema. Puedes verificar si tienes Java instalado usando el comando:
  ```bash
  java -version

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear nodos
        Nodo nodo1 = new NodoSimple(1);
        Nodo nodo2 = new NodoSimple(2);
        Nodo nodo3 = new NodoSimple(3);
        Nodo nodo4 = new NodoDoble(4);

        // Crear aristas
        Arista arista1 = new Arista(nodo1, nodo2, 5);
        Arista arista2 = new Arista(nodo2, nodo3, 10);
        Arista arista3 = new Arista(nodo3, nodo4, 15);

        // Crear un grafo
        Graf graf = new Graf();

        // Agregar nodos al grafo
        graf.addNodo(nodo1);
        graf.addNodo(nodo2);
        graf.addNodo(nodo3);
        graf.addNodo(nodo4);

        // Agregar aristas al grafo
        graf.addArista(arista1);
        graf.addArista(arista2);
        graf.addArista(arista3);

        // Mostrar nodos y aristas del grafo
        System.out.println("Nodos en el grafo:");
        for (Nodo nodo : graf.getNodos()) {
            System.out.println("Nodo: " + nodo.getDato());
        }

        System.out.println("\nAristas en el grafo:");
        for (Arista arista : graf.getAristas()) {
            System.out.println("Arista: " + arista.getOrigen().getDato() + " -> " + arista.getDestino().getDato() + " con peso " + arista.getPeso());
        }

        // Crear y usar listas
        ListaSimple listaSimple = new ListaSimple();
        listaSimple.agregar(nodo1);
        listaSimple.agregar(nodo2);
        listaSimple.agregar(nodo3);

        ListaDoble listaDoble = new ListaDoble();
        listaDoble.agregar(nodo1);
        listaDoble.agregar(nodo2);
        listaDoble.agregar(nodo3);
        listaDoble.agregar(nodo4);

        // Mostrar elementos de las listas
        System.out.println("\nLista simple:");
        Nodo current = listaSimple.primero;
        while (current != null) {
            System.out.println("Nodo: " + current.getDato());
            current = current.getSiguiente();
        }

        System.out.println("\nLista doble:");
        current = listaDoble.primero;
        while (current != null) {
            System.out.println("Nodo: " + current.getDato());
            current = current.getSiguiente();
        }

        // Crear y usar árboles
        ArbolAVL arbolAVL = new ArbolAVL();
        arbolAVL.insertar(10);
        arbolAVL.insertar(20);
        arbolAVL.insertar(5);

        ArbolRojoNegro arbolRojoNegro = new ArbolRojoNegro();
        arbolRojoNegro.insertar(30);
        arbolRojoNegro.insertar(15);
        arbolRojoNegro.insertar(25);

        // Realizar búsquedas en los árboles
        Nodo nodoBuscadoAVL = arbolAVL.buscar(20);
        Nodo nodoBuscadoRojoNegro = arbolRojoNegro.buscar(25);

        System.out.println("\nBúsqueda en AVL: Nodo encontrado con dato " + (nodoBuscadoAVL != null ? nodoBuscadoAVL.getDato() : "no encontrado"));
        System.out.println("Búsqueda en Rojo-Negro: Nodo encontrado con dato " + (nodoBuscadoRojoNegro != null ? nodoBuscadoRojoNegro.getDato() : "no encontrado"));
    }
}

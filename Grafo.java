public abstract class Grafo extends EstructuraDato {
    protected Lista nodo;
    protected Lista arista;

    public abstract int agregarNodo(int dato);
    public abstract int agregarArista(Nodo nodo1, Nodo nodo2);
    public abstract int eliminarNodo(int dato);
    public abstract int eliminarArista(Nodo nodo1, Nodo nodo2);
}


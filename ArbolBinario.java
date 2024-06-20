public abstract class ArbolBinario extends EstructuraDato {
    protected Nodo raiz;

    public abstract int buscarValor();
    public abstract int recorridoInOrden();
    public abstract int recorridoPostOrden();
    public abstract int recorridoPreOrden();
    public abstract int agregarRecursivo();
    public abstract int eliminarRecursivo();
    public abstract int altura();
    public abstract int insertarNodo(int dato);
    public abstract void eliminarNodo(int dato);
    public abstract void imprimirInOrden();
    public abstract void imprimirPostOrden();
    public abstract void imprimirPreOrden();
    public abstract void balancear();
}

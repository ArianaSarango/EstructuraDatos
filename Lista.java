public abstract class Lista extends EstructuraDato {
    protected Nodo cabeza;
    protected Nodo cola;
    protected int tamaño;

    public abstract void recorrer();
    public abstract void vaciar();
    public abstract int obtenerTamaño();
}


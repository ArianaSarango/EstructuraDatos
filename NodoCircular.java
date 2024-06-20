public class NodoCircular extends Principal {
    private NodoCircular siguiente;

    public NodoCircular(int valor) {
        super(valor);
    }

    public NodoCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCircular siguiente) {
        this.siguiente = siguiente;
    }
}

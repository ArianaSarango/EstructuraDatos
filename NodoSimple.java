public class NodoSimple extends Principal {
    private NodoSimple siguiente;

    public NodoSimple(int valor) {
        super(valor);
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
}

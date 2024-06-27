public class NodoDoble extends Principal {
    public NodoDoble siguiente;
    public NodoDoble anterior;

    public NodoDoble(int valor) {
        super(valor);
    }

    public NodoDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}



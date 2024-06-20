class NodoDobleCircular extends Principal {
    private NodoDobleCircular siguiente;
    private NodoDobleCircular anterior;

    public NodoDobleCircular(int valor) {
        super(valor);
    }

    public NodoDobleCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleCircular siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDobleCircular getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleCircular anterior) {
        this.anterior = anterior;
    }
}
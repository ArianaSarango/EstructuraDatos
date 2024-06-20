public class NodoArbol extends Principal {
    private NodoArbol izquierdo;
    private NodoArbol derecha;

    public NodoArbol(int valor) {
        super(valor);
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecho(NodoArbol derecha) {
        this.derecha = derecha;
    }
}

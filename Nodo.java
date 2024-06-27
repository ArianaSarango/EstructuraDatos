public abstract class Nodo {
    protected int dato;
    protected int valor;
    protected Color color;

    public int obtenerDato() {
        return dato;
    }

    public void establecerDato(int dato) {
        this.dato = dato;
    }
}

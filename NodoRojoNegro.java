public class NodoRojoNegro extends Principal {
    private String color;
    private NodoRojoNegro izquierda;
    private NodoRojoNegro derecha;

    public NodoRojoNegro(int valor) {
        super(valor);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public NodoRojoNegro getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoRojoNegro izquierda) {
        this.izquierda = izquierda;
    }

    public NodoRojoNegro getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoRojoNegro derecha) {
        this.derecha = derecha;
    }
}

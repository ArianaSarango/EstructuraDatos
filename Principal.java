public abstract class Principal {

    protected int valor;

    public Principal(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }


    private NodoArbol nodoArbol;
    private NodoAvl nodoAvl;
    private NodoRojoNegro nodoRojoNegro;
    private NodoSimple nodoSimple;
    private NodoDoble nodoDoble;
    private NodoCircular nodoCircular;
    private NodoDobleCircular nodoDobleCircular;
    private Grafo grafo;


    public Principal(NodoArbol nodoArbol, NodoAvl nodoAvl, NodoRojoNegro nodoRojoNegro, NodoSimple nodoSimple,
                     NodoDoble nodoDoble, NodoCircular nodoCircular, NodoDobleCircular nodoDobleCircular, Grafo grafo) {
        this.nodoArbol = nodoArbol;
        this.nodoAvl = nodoAvl;
        this.nodoRojoNegro = nodoRojoNegro;
        this.nodoSimple = nodoSimple;
        this.nodoDoble = nodoDoble;
        this.nodoCircular = nodoCircular;
        this.nodoDobleCircular = nodoDobleCircular;
        this.grafo = grafo;
    }


    public NodoArbol getNodoArbol() {
        return nodoArbol;
    }

    public void setNodoArbol(NodoArbol nodoArbol) {
        this.nodoArbol = nodoArbol;
    }

    public NodoAvl getNodoAvl() {
        return nodoAvl;
    }

    public void setNodoAvl(NodoAvl nodoAvl) {
        this.nodoAvl = nodoAvl;
    }

    public NodoRojoNegro getNodoRojoNegro() {
        return nodoRojoNegro;
    }

    public void setNodoRojoNegro(NodoRojoNegro nodoRojoNegro) {
        this.nodoRojoNegro = nodoRojoNegro;
    }

    public NodoSimple getNodoSimple() {
        return nodoSimple;
    }

    public void setNodoSimple(NodoSimple nodoSimple) {
        this.nodoSimple = nodoSimple;
    }

    public NodoDoble getNodoDoble() {
        return nodoDoble;
    }

    public void setNodoDoble(NodoDoble nodoDoble) {
        this.nodoDoble = nodoDoble;
    }

    public NodoCircular getNodoCircular() {
        return nodoCircular;
    }

    public void setNodoCircular(NodoCircular nodoCircular) {
        this.nodoCircular = nodoCircular;
    }

    public NodoDobleCircular getNodoDobleCircular() {
        return nodoDobleCircular;
    }

    public void setNodoDobleCircular(NodoDobleCircular nodoDobleCircular) {
        this.nodoDobleCircular = nodoDobleCircular;
    }

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }
}

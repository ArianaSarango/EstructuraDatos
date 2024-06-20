public class Main {
    public static void main(String[] args) {

        NodoArbol nodoArbol = new NodoArbol(10);
        NodoAvl nodoAvl = new NodoAvl(20);
        NodoRojoNegro nodoRojoNegro = new NodoRojoNegro(30);
        NodoSimple nodoSimple = new NodoSimple(40);
        NodoDoble nodoDoble = new NodoDoble(50);
        NodoCircular nodoCircular = new NodoCircular(60);
        NodoDobleCircular nodoDobleCircular = new NodoDobleCircular(70);
        Grafo grafo = new Grafo(5, 10);

        nodoArbol.setIzquierdo(new NodoArbol(5));
        nodoArbol.setDerecho(new NodoArbol(15));

        nodoAvl.setAltura(3);

        nodoRojoNegro.setColor("Rojo");
        nodoRojoNegro.setIzquierda(new NodoRojoNegro(25));
        nodoRojoNegro.setDerecha(new NodoRojoNegro(35));

        nodoSimple.setSiguiente(new NodoSimple(45));

        nodoDoble.setSiguiente(new NodoDoble(55));
        nodoDoble.setAnterior(new NodoDoble(45));

        nodoCircular.setSiguiente(new NodoCircular(65));

        nodoDobleCircular.setSiguiente(new NodoDobleCircular(75));
        nodoDobleCircular.setAnterior(new NodoDobleCircular(65));

        System.out.println("Valor Nodo Arbol: " + nodoArbol.getValor());
        System.out.println("Altura Nodo AVL: " + nodoAvl.getAltura());
        System.out.println("Color Nodo Rojo Negro: " + nodoRojoNegro.getColor());
        System.out.println("Valor Nodo Simple: " + nodoSimple.getValor());
        System.out.println("Valor Nodo Doble: " + nodoDoble.getValor());
        System.out.println("Valor Nodo Circular: " + nodoCircular.getValor());
        System.out.println("Valor Nodo Doble Circular: " + nodoDobleCircular.getValor());
        System.out.println("Vertices en Grafo: " + grafo.getVertices());
        System.out.println("Aristas en Grafo: " + grafo.getAristas());
    }
}

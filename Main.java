public class Main {
    public static void main(String[] args) {

        NodoArbol nodoArbol = new NodoArbol(10);
        NodoAvl nodoAvl = new NodoAvl(30);
        NodoRojoNegro nodoRojoNegro = new NodoRojoNegro(40);
        NodoSimple nodoSimple = new NodoSimple(50);
        NodoDoble nodoDoble = new NodoDoble(60);
        NodoCircular nodoCircular = new NodoCircular(70);
        NodoDobleCircular nodoDobleCircular = new NodoDobleCircular(80);
        Grafo grafo = new Grafo(5, 10);

        nodoArbol.setIzquierdo(new NodoArbol(10));
        nodoArbol.setDerecho(new NodoArbol(15));

        nodoAvl.setAltura(3);

        nodoRojoNegro.setColor("NEGRO");
        nodoRojoNegro.setIzquierda(new NodoRojoNegro(29));
        nodoRojoNegro.setDerecha(new NodoRojoNegro(31));

        nodoSimple.setSiguiente(new NodoSimple(48));

        nodoDoble.setSiguiente(new NodoDoble(54));
        nodoDoble.setAnterior(new NodoDoble(49));

        nodoCircular.setSiguiente(new NodoCircular(66));

        nodoDobleCircular.setSiguiente(new NodoDobleCircular(77));
        nodoDobleCircular.setAnterior(new NodoDobleCircular(67));

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

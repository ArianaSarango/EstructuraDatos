public class Main {
    public static void main(String[] args) {
        NodoSimple nodoSimple = new NodoSimple(10);
        nodoSimple.establecerDato(20);
        System.out.println("Dato de NodoSimple: " + nodoSimple.obtenerDato());

        ListaEnlazadaSimple listaEnlazadaSimple = new ListaEnlazadaSimple();
        listaEnlazadaSimple.agregar();
        System.out.println("Tamaño de ListaEnlazadaSimple: " + listaEnlazadaSimple.obtenerTamaño());

        ArbolAVL arbolAVL = new ArbolAVL();
        arbolAVL.insertarNodo(30);
        arbolAVL.imprimirInOrden();
    }
}

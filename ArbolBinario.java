public class ArbolBinario {
    private NodoArbol nodoArbolPrincipal;

    public NodoArbol getNodoArbolPrincipal() {
        return nodoArbolPrincipal;
    }

    public void setNodoArbolPrincipal(NodoArbol nodoArbolPrincipal) {
        this.nodoArbolPrincipal = nodoArbolPrincipal;
    }

    public void recorrerOrden(NodoArbol nodo) {
        if (nodo != null) {
            recorrerOrden(nodo.getIzquierdo());
            System.out.println(nodo.getValor());
            recorrerOrden(nodo.getDerecha());
        }
    }

    public void recorrerPreOrden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.println(nodo.getValor());
            recorrerPreOrden(nodo.getIzquierdo());
            recorrerPreOrden(nodo.getDerecha());
        }
    }

    public void recorrerPostOrden(NodoArbol nodo) {
        if (nodo != null) {
            recorrerPostOrden(nodo.getIzquierdo());
            recorrerPostOrden(nodo.getDerecha());
            System.out.println(nodo.getValor());
        }
    }
}
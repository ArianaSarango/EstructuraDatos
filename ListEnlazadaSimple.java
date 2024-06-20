public class ListEnlazadaSimple {

    public  ListEnlazadaSimple NodoSimpleCabeza;

    public ListEnlazadaSimple NodoSimpleSiguiente(){

        return NodoSimpleCabeza;
    }

    public void setNodoSimpleCabeza(ListEnlazadaSimple NodoSimpleCabeza){

        this.NodoSimpleCabeza = NodoSimpleCabeza;
    }

}

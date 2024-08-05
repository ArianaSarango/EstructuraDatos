
package arbolgrafico;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * Nikooll
 */
public class SimuladorArbolBinario {

    Arbol miArbol = new Arbol();
    private Nodo raiz;

    public SimuladorArbolBinario() {
    }

    public boolean insertar(Integer dato) {
        return (this.miArbol.agregar(dato));
    }

    public String borrar(Integer dato) {
        Integer x = this.miArbol.borrar(dato);
        if (x == null) {
            return ("No existe el dato en el arbol");
        }
        return ("Borrado el dato: " + x.toString());
    }

    public String preOrden() {
        ArrayList it = this.miArbol.preOrden();
        return (recorrido(it, "Recorrido PreOrden"));
    }

    public String inOrden() {
        ArrayList it = this.miArbol.inOrden();
        return (recorrido(it, "Recorrido InOrden"));
    }

    public String posOrden() {
        ArrayList it = this.miArbol.postOrden();
        return (recorrido(it, "Recorrido PosOrden"));
    }

    public String imprimirPorNiveles() {
        ArrayList it = this.miArbol.impNiveles();
        return (recorrido(it, "Imprimir Por niveles"));
    }

    public String darHojas() {
        ArrayList it = this.miArbol.getHojas();
        return (recorrido(it, "Hojas del Arbol"));
    }

    public String darPadre(Integer hijo) {
        if (this.miArbol.getRaiz().getDato() == (hijo)) {
            return ("La raiz no tiene padre");
        }
        Integer padre = this.miArbol.padre(hijo);
        if (padre == null) {
            return ("No existe el Dato: " + hijo.toString());
        }
        return ("El padre de: " + hijo + "\n es : " + padre.toString());
    }

    public String esta(Integer dato) {
        boolean siEsta = this.miArbol.buscar(dato);
        String r = "El dato:" + dato.toString() + "\n";
        r += siEsta ? "Si se encuentra en el arbol" : "No se encuentra en el arbol";
        return (r);
    }

    private String recorrido(ArrayList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "\n";
            i++;
        }
        return (r);
    }
    
    public String CantidadNodos(){
        return this.miArbol.cantidadNodos();
    }
    
    public String CantidadHojas(){
        return this.miArbol.cantidadNodosHoja();
    }
    public String alturaArbol(){
        return this.miArbol.retornarAltura();
    }
    public String menorValor(){
        return this.miArbol.menorValor();
    }
    public String mayorValor(){
        return this.miArbol.mayorValor();
    }
    public String balance(){
        return this.miArbol.imprimirBalance();
    }
    public String borrarMenor(){
        return this.miArbol.borrarMenor();
    }
    public String borrarMayor(){
        return this.miArbol.borrarMayor();
    }
    public String porNivel(){
        this.miArbol.alturaArbol();
        ArrayList it = this.miArbol.imprimirNivel();
        return (recorrido(it, "Imprimir Por niveles en orden!!!"));
    }
    public String cambiar() {
        this.miArbol.cambiar();
        return "Valores cambiados!!!";
    }
    public String ramaMayor() {
        ArrayList it = this.miArbol.ObtenerRamamayor();
        return (recorrido(it, "Rama(s) con mas valores"));
    }
    
    public void podarArbol() {
        this.miArbol.podar();
    }

    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }
    
       public List<Integer> recorrerPreOrden() {
        List<Integer> recorrido = new ArrayList<>();
        recorrerpreOrden(raiz, recorrido);
        return recorrido;
    }
    
    private void recorrerpreOrden(Nodo nodo, List<Integer> recorrido) {
        if (nodo != null) {
            recorrido.add(nodo.getDato());
            recorrerpreOrden(nodo.getIzq(), recorrido);
            recorrerpreOrden(nodo.getDer(), recorrido);
        }
    }

    public List<Integer> recorrerInOrden() {
        List<Integer> recorrido = new ArrayList<>();
        recorrerinOrden(raiz, recorrido);
        return recorrido;
    }

    private void recorrerinOrden(Nodo nodo, List<Integer> recorrido) {
        if (nodo != null) {
            recorrerinOrden(nodo.getIzq(), recorrido);
            recorrido.add(nodo.getDato());
            recorrerinOrden(nodo.getDer(), recorrido);
        }
    }

    public List<Integer> recorrerPostOrden() {
        List<Integer> recorrido = new ArrayList<>();
        recorrerpostOrden(raiz, recorrido);
        return recorrido;
    }

    private void recorrerpostOrden(Nodo nodo, List<Integer> recorrido) {
        if (nodo != null) {
            recorrerpostOrden(nodo.getIzq(), recorrido);
            recorrerpostOrden(nodo.getDer(), recorrido);
            recorrido.add(nodo.getDato());
        }
    }
    

    public List<Nodo> obtenerRecorridoInOrden() {
        return this.miArbol.inOrden();
    }

    public List<Nodo> obtenerRecorridoPreOrden() {
        return this.miArbol.preOrden();
    }

    public List<Nodo> obtenerRecorridoPosOrden() {
        return this.miArbol.postOrden();
    }

    public List<Nodo> obtenerRecorridoPorNiveles() {
        return this.miArbol.imprimirNivel();
    }

    public List<Nodo> obtenerRecorridoPorNivelOrdenado() {
        return this.miArbol.impNiveles();
    }



  
   
}

   




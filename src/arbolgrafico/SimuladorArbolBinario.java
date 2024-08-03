
package arbolgrafico;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.JPanel;


/**
 *
 * Nikooll
 */
public class SimuladorArbolBinario {

    Arbol miArbol = new Arbol();
    private List<Nodo> nodosParaPintar = new ArrayList<>();
    private Nodo raiz;
    private Nodo aux;

    public SimuladorArbolBinario() {
    }

    public boolean insertar(Integer dato) {
         boolean resultado = this.miArbol.agregar(dato);
        this.raiz = miArbol.getRaiz();  // Actualizar la raíz después de insertar
        return resultado;
    }

    public String borrar(Integer dato) {
        Integer x = this.miArbol.borrar(dato);
        if (x == null) {
            return ("No existe el dato en el arbol");
        }
        this.raiz = miArbol.getRaiz();  // Actualizar la raíz después de borrar
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
         return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                pintarArbol(g, raiz, getWidth() / 2, 30, 40, 40);
            }
        };
       
    }

    void limpiarNodosParaPintar() {
        nodosParaPintar.clear();
       
    }

    void agregarNodoParaPintar(Nodo nodo) {
        nodosParaPintar.add(nodo);
        
    }
    
    
    
     private void pintarArbol(Graphics g, Nodo nodo, int x, int y, int xOffset, int yOffset) {
        if (nodo == null) return;
        
         if(nodo.equals(aux)){
            g.setColor(java.awt.Color.RED);
        }else{
            g.setColor(java.awt.Color.BLACK);
        }

        g.setColor(nodo.getColor());
        g.fillOval(x - 15, y - 15, 30, 30);
        g.setColor(Color.BLACK);
        g.drawOval(x - 15, y - 15, 30, 30);
        g.drawString(String.valueOf(nodo.getDato()), x - 10, y + 5);

        if (nodo.getIzq() != null) {
            g.drawLine(x, y, x - xOffset, y + yOffset);
            pintarArbol(g, nodo.getIzq(), x - xOffset, y + yOffset, xOffset / 2, yOffset);
        }
        if (nodo.getDer() != null) {
            g.drawLine(x, y, x + xOffset, y + yOffset);
            pintarArbol(g, nodo.getDer(), x + xOffset, y + yOffset, xOffset / 2, yOffset);
        }
    }
     
    public void updateView(Nodo nodo){
        this.aux = nodo;        
        repaint();
    }
    

    public List<Nodo> obtenerRecorridoInOrden() {
        List<Nodo> recorrido = new ArrayList<>();
        inOrden(raiz, recorrido);
        return recorrido;
    }

    private void inOrden(Nodo nodo, List<Nodo> recorrido) {
        if (nodo != null) {
            inOrden(nodo.getIzq(), recorrido);
            recorrido.add(nodo);
            inOrden(nodo.getDer(), recorrido);
        }
    }

    public List<Nodo> obtenerRecorridoPreOrden() {
        List<Nodo> recorrido = new ArrayList<>();
        preOrden(raiz, recorrido);
        return recorrido;
    }

    private void preOrden(Nodo nodo, List<Nodo> recorrido) {
        if (nodo != null) {
            recorrido.add(nodo);
            preOrden(nodo.getIzq(), recorrido);
            preOrden(nodo.getDer(), recorrido);
        }
    }

    public List<Nodo> obtenerRecorridoPosOrden() {
        List<Nodo> recorrido = new ArrayList<>();
        posOrden(raiz, recorrido);
        return recorrido;
    }

    private void posOrden(Nodo nodo, List<Nodo> recorrido) {
        if (nodo != null) {
            posOrden(nodo.getIzq(), recorrido);
            posOrden(nodo.getDer(), recorrido);
            recorrido.add(nodo);
        }
    }

    public List<Nodo> obtenerRecorridoPorNiveles() {
        List<Nodo> recorrido = new ArrayList<>();
        if (raiz == null) return recorrido;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            Nodo nodo = cola.poll();
            recorrido.add(nodo);
            if (nodo.getIzq() != null) cola.add(nodo.getIzq());
            if (nodo.getDer() != null) cola.add(nodo.getDer());
        }

        return recorrido;
    }

    private void repaint() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

   





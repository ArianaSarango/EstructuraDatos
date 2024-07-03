
package arbolgrafico;

import java.awt.Color;

public class Nodo {
    
    private int dato;
    private Nodo izq, der;
    private Color color;

    public Nodo(int dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    } 
    
    public Color getColor(){
    
    return color;
    
    }
    
    public void setColor(Color color){
         
        this.color = color;
    
    }

}

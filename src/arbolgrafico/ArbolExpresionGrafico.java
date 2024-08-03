package arbolgrafico;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class ArbolExpresionGrafico extends JPanel {
    private Arbol miArbol;
    private HashMap<Nodo, Rectangle> posicionNodos = null;
    private HashMap<Nodo, Dimension> subtreeSizes = null;
    private boolean dirty = true;
    private int parent2child = 20, child2child = 30;
    private Dimension empty = new Dimension(0, 0);
    private FontMetrics fm = null;
    
    public ArbolExpresionGrafico(Arbol miArbol) {
        this.miArbol = miArbol;
        this.setBackground(Color.WHITE);
        posicionNodos = new HashMap<>();
        subtreeSizes = new HashMap<>();
        dirty = true;
        repaint();      
    }

    private void calcularPosiciones() {
        posicionNodos.clear();
        subtreeSizes.clear();
        Nodo root = this.miArbol.getRaiz();
        if (root != null) {
            calcularTamañoSubarbol(root);
            calcularPosicion(root, Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        }
    }

    private Dimension calcularTamañoSubarbol(Nodo n) {
        if (n == null) return new Dimension(0, 0);
        Dimension ld = calcularTamañoSubarbol(n.getIzq());
        Dimension rd = calcularTamañoSubarbol(n.getDer());
        int h = fm.getHeight() + parent2child + Math.max(ld.height, rd.height);
        int w = ld.width + child2child + rd.width;
        Dimension d = new Dimension(w, h);
        subtreeSizes.put(n, d);
        return d;
    }

    private void calcularPosicion(Nodo n, int left, int right, int top) {
        if (n == null) return;
        Dimension ld = subtreeSizes.getOrDefault(n.getIzq(), empty);
        Dimension rd = subtreeSizes.getOrDefault(n.getDer(), empty);
        int center = 0;
        if (right != Integer.MAX_VALUE) {
            center = right - rd.width - child2child / 2;
        } else if (left != Integer.MAX_VALUE) {
            center = left + ld.width + child2child / 2;
        }
        int width = fm.stringWidth(n.getDato() + "");
        posicionNodos.put(n, new Rectangle(center - width / 2 - 3, top, width + 6, fm.getHeight()));
        calcularPosicion(n.getIzq(), Integer.MAX_VALUE, center - child2child / 2, top + fm.getHeight() + parent2child);
        calcularPosicion(n.getDer(), center + child2child / 2, Integer.MAX_VALUE, top + fm.getHeight() + parent2child);
    }

    private void dibujarArbol(Graphics2D g, Nodo n, int puntox, int puntoy, int yoffs) {
        if (n == null) return;
        Rectangle r = posicionNodos.get(n);
        int radius = Math.max(r.width, r.height) / 2;
        int centerX = r.x + r.width / 2;
        int centerY = r.y + r.height / 2;

        // Dibuja el fondo blanco dentro del círculo
        g.setColor(Color.BLACK);
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // Dibuja el contorno del círculo
        g.setColor(n.getColor());
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // Dibuja el contorno negro del círculo
        g.setColor(Color.BLACK);
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // Dibuja el dato del nodo
        g.setColor(Color.BLACK);
        g.drawString(n.getDato() + "", centerX - fm.stringWidth(n.getDato() + "") / 2, centerY + yoffs / 2);

        if (puntox != Integer.MAX_VALUE)
            g.drawLine(puntox, puntoy, centerX, centerY - radius);
        
        dibujarArbol(g, n.getIzq(), centerX, centerY + radius, yoffs);
        dibujarArbol(g, n.getDer(), centerX, centerY + radius, yoffs);
    }

    public void paint(Graphics g) {
        super.paint(g);
        fm = g.getFontMetrics();
        if (dirty) {
            calcularPosiciones();
            dirty = false;
        }
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(getWidth() / 2, parent2child);
        dibujarArbol(g2d, this.miArbol.getRaiz(), Integer.MAX_VALUE, Integer.MAX_VALUE, fm.getLeading() + fm.getAscent());
        fm = null;
    }
}

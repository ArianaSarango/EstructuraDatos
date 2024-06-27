public class Grafo extends Principal {
    private int vertices;
    private int aristas;

    public Grafo(int vertices, int aristas) {
        super(0); // El valor no es relevante para el grafo, así que se puede pasar 0
        this.vertices = vertices;
        this.aristas = aristas;
    }

    public void agregarVertice() {
        // Lógica para agregar un vértice
    }

    public void agregarArista() {
        // Lógica para agregar una arista
    }

    public void eliminarVertice() {
        // Lógica para eliminar un vértice
    }

    public void eliminarArista() {
        // Lógica para eliminar una arista
    }

    public void recorrer() {
        // Lógica para recorrer el grafo
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public int getAristas() {
        return aristas;
    }

    public void setAristas(int aristas) {
        this.aristas = aristas;
    }
}

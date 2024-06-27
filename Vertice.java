import java.util.ArrayList;
import java.util.List;

public class Vertice {
    private List<Vertice> adyacente;

    public Vertice() {
        this.adyacente = new ArrayList<>();
    }

    public List<Vertice> getAdyacente() {
        return adyacente;
    }

    public void conectar(Vertice vertice) {
        this.adyacente.add(vertice);
    }

    public void desconectar(Vertice vertice) {
        this.adyacente.remove(vertice);
    }
}


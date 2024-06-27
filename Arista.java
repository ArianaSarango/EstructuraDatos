public class Arista {
    public Arista inicio;
    public Arista fin;
    public int peso;

    public Arista getInicio() {
        return inicio;
    }

    public void setInicio(Arista inicio) {
        this.inicio = inicio;
    }

    public Arista getFin() {
        return fin;
    }

    public void setFin(Arista fin) {
        this.fin = fin;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void invertir() {
        Arista temp = inicio;
        inicio = fin;
        fin = temp;
    }
}


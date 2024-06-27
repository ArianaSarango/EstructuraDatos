class NodoAVL {
    private int value;
    private NodoAVL left;
    private NodoAVL right;

    public NodoAVL(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public NodoAVL getLeft() {
        return left;
    }

    public void setLeft(NodoAVL left) {
        this.left = left;
    }

    public NodoAVL getRight() {
        return right;
    }

    public void setRight(NodoAVL right) {
        this.right = right;
    }
}
public class ListaEntera {
    // lista de números enteros
    private int[] list;

    // tamaño
    private int t;

    // constructor
    public ListaEntera(int tamano) {
        list = new int[tamano];
        t = 0;
    }

    // tamaño de la lista
    public int tamano() {
        return t;
    }

    // index
    public int get(int i) {
        return list[i];
    }

    // set
    public void set(int i, int x) {
        list[i] = x;
    }

    // toString
    public String toString() {
        String s = "[";
        for (int i = 0; i < t; i++) {
            s += list[i];
            if (i < t - 1) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}

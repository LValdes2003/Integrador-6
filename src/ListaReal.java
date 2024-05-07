public class ListaReal {
    // lista de números reales
    private double[] list;

    // tamaño
    private int t;

    // constructor
    public ListaReal(int tamano) {
        list = new double[tamano];
        t = 0;
    }

    // tamaño de la lista
    public int tamano() {
        return t;
    }

    // index
    public double get(int i) {
        return list[i];
    }

    // set
    public void set(int i, double x) {
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

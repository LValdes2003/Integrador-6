import java.util.Arrays;

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

    // ordenar
    public void ordenar() {
        Arrays.sort(list, 0, t);
    }

    // compara listas
    public double[] compara(ListaReal listaReal) {
        double[] resultado = new double[t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < listaReal.t; j++) {
                if (list[i] == listaReal.list[j]) {
                    resultado[i] = list[i];
                }
            }
        }
        return resultado;
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

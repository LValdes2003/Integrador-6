import java.util.Arrays;

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

    // ordenar
    public void ordenar() {
        Arrays.sort(list, 0, t);
    }

    // compara listas
    public int[] compara(ListaEntera listaEntera) {
        int[] resultado = new int[t];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < listaEntera.t; j++) {
                if (list[i] == listaEntera.list[j]) {
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

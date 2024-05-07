public class Pareja {
    // par de enteros
    private int a;
    private int b;

    // constructor
    public Pareja(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    // setters

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    // toString

    public String toString() {
        return "(" + a + ", " + b + ")";
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pareja pareja = null;
        ListaEntera listaEntera = null;
        ListaReal listaReal = null;

        while (true) {
            System.out.println("\nEscoge una opción:");
            System.out.println("1. Crea pareja de enteros");
            System.out.println("2. Crea lista de enteros");
            System.out.println("3. Crear lista de números reales");
            System.out.println("4. Salir");
            if (pareja != null) {
                System.out.println("5. Modificar pareja");
                System.out.println("6. Ver pareja");
            }
            if (listaEntera != null) {
                System.out.println("7. Modificar lista de enteros");
                System.out.println("8. Ver lista de enteros");
                System.out.println("9. Ordenar lista de enteros");
            }
            if (listaReal != null) {
                System.out.println("10. Modificar lista de números reales");
                System.out.println("11. Ver lista de números reales");
                System.out.println("12. Ordenar lista de números reales");
            }


            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer entero:");
                    int a = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Introduce el segundo entero:");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    pareja = new Pareja(a, b);
                    System.out.println("Pareja creada: " + pareja);
                    break;
                case 2:
                    System.out.println("Introduce el tamaño de la lista:");
                    int tamanoEntero = scanner.nextInt();
                    scanner.nextLine();
                    listaEntera = new ListaEntera(tamanoEntero);
                    System.out.println("Lista de enteros creada: " + listaEntera);
                    break;
                case 3:
                    System.out.println("Introduce el tamaño de la lista:");
                    int tamanoReal = scanner.nextInt();
                    scanner.nextLine();
                    listaReal = new ListaReal(tamanoReal);
                    System.out.println("Lista de números reales creada: " + listaReal);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                case 5:
                    if (pareja != null) {
                        System.out.println("Introduce el nuevo valor para el primer entero:");
                        int nuevoA = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Introduce el nuevo valor para el segundo entero:");
                        int nuevoB = scanner.nextInt();
                        scanner.nextLine();
                        pareja.setA(nuevoA);
                        pareja.setB(nuevoB);
                        System.out.println("Pareja modificada: " + pareja);
                    } else {
                        System.out.println("No hay pareja creada. Crea una pareja primero.");
                    }
                    break;
                case 6:
                    if (pareja != null) {
                        System.out.println("Pareja: " + pareja);
                    } else {
                        System.out.println("No hay pareja creada. Crea una pareja primero.");
                    }
                    break;
                case 7:
                    if (listaEntera != null) {
                        System.out.println("Introduce el índice que deseas modificar:");
                        int indiceEntero = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Introduce el nuevo valor:");
                        int nuevoValorEntero = scanner.nextInt();
                        scanner.nextLine();
                        listaEntera.set(indiceEntero, nuevoValorEntero);
                        System.out.println("Lista de enteros modificada: " + listaEntera.toString());
                    } else {
                        System.out.println("No hay lista de enteros creada. Crea una lista primero.");
                    }
                    break;
                case 8:
                    if (listaEntera != null) {
                        System.out.println("Lista de enteros: " + listaEntera.toString());
                    } else {
                        System.out.println("No hay lista de enteros creada. Crea una lista primero.");
                    }
                    break;
                case 9:
                    if (listaEntera != null) {
                        listaEntera.ordenar();
                        System.out.println("Lista de enteros ordenada: " + listaEntera.toString());
                    } else {
                        System.out.println("No hay lista de enteros creada. Crea una lista primero.");
                    }
                    break;
                case 10:
                    if (listaReal != null) {
                        System.out.println("Introduce el índice que deseas modificar:");
                        int indiceReal = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Introduce el nuevo valor:");
                        double nuevoValorReal = scanner.nextDouble();
                        scanner.nextLine();
                        listaReal.set(indiceReal, nuevoValorReal);
                        System.out.println("Lista de números reales modificada: " + listaReal.toString());
                    } else {
                        System.out.println("No hay lista de números reales creada. Crea una lista primero.");
                    }
                    break;
                case 11:
                    if (listaReal != null) {
                        System.out.println("Lista de números reales: " + listaReal.toString());
                    } else {
                        System.out.println("No hay lista de números reales creada. Crea una lista primero.");
                    }
                    break;
                case 12:
                    if (listaReal != null) {
                        listaReal.ordenar();
                        System.out.println("Lista de números reales ordenada: " + listaReal.toString());
                    } else {
                        System.out.println("No hay lista de números reales creada. Crea una lista primero.");
                    }
                    break;
            }
        }
    }
}

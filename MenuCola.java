import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Cola {
    private Queue<Integer> elementos;

    public Cola() {
        this.elementos = new LinkedList<>();
    }

    public void encolar(int dato) {
        elementos.offer(dato);
        System.out.println("Elemento encolado: " + dato);
    }

    public int desencolar() {
        if (elementos.isEmpty()) {
            System.out.println("La cola está vacía. No se puede desencolar.");
            return -1; // Se asume -1 como un valor predeterminado para una cola vacía
        } else {
            int elementoDesencolado = elementos.poll();
            System.out.println("Elemento desencolado: " + elementoDesencolado);
            return elementoDesencolado;
        }
    }

    public void mostrar() {
        if (elementos.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Cola actual: " + elementos);
        }
    }
}

public class MenuCola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cola cola = new Cola();

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Encolar");
            System.out.println("2. Desencolar");
            System.out.println("3. Mostrar");
            System.out.println("0. Salir");

            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el elemento para encolar: ");
                    int elementoEncolar = scanner.nextInt();
                    cola.encolar(elementoEncolar);
                    break;

                case 2:
                    cola.desencolar();
                    break;

                case 3:
                    cola.mostrar();
                    break;

                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intenta nuevamente.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}
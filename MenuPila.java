import java.util.Scanner;

class Pila {
    private static final int TAMANO_MAXIMO = 10;
    private int cima;
    private int[] elementos;

    public Pila() {
        cima = -1;
        elementos = new int[TAMANO_MAXIMO];
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == TAMANO_MAXIMO - 1;
    }

    public void apilar(int dato) {
        if (estaLlena()) {
            System.out.println("La pila está llena. No se puede apilar el elemento.");
        } else {
            elementos[++cima] = dato;
            System.out.println("Elemento apilado: " + dato);
        }
    }

    public int desapilar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía. No se puede desapilar.");
            return -1; // Se asume -1 como un valor predeterminado para una pila vacía
        } else {
            int elementoDesapilado = elementos[cima--];
            System.out.println("Elemento desapilado: " + elementoDesapilado);
            return elementoDesapilado;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.print("Pila actual: ");
            for (int i = 0; i <= cima; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}

public class MenuPila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila pila = new Pila();

        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Apilar");
            System.out.println("2. Desapilar");
            System.out.println("3. Mostrar");
            System.out.println("0. Salir");

            System.out.print("Ingresa tu opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el elemento para apilar: ");
                    int elementoApilar = scanner.nextInt();
                    pila.apilar(elementoApilar);
                    break;

                case 2:
                    pila.desapilar();
                    break;

                case 3:
                    pila.mostrar();
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
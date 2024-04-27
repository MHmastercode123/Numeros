import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar tres números enteros diferentes
        System.out.println("Ingrese el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número entero:");
        int num3 = scanner.nextInt();

        // Calcular la suma de los dos números más pequeños
        int sumaMenores = sumaDosMenores(num1, num2, num3);

        // Calcular la diferencia entre los dos números más grandes
        int diferenciaMayores = diferenciaDosMayores(num1, num2, num3);

        // Encontrar cuál de los tres números es el mayor
        int mayor = encontrarMayor(num1, num2, num3);

        // Mostrar resultados por pantalla
        System.out.println("La suma de los dos números más pequeños es: " + sumaMenores);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferenciaMayores);
        System.out.println("El mayor de los tres números es: " + mayor);
    }

    // Método para encontrar la suma de los dos números más pequeños
    public static int sumaDosMenores(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a + Math.min(b, c);
        } else if (b <= a && b <= c) {
            return b + Math.min(a, c);
        } else {
            return c + Math.min(a, b);
        }
    }

    // Método para encontrar la diferencia entre los dos números más grandes
    public static int diferenciaDosMayores(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a - Math.min(b, c);
        } else if (b >= a && b >= c) {
            return b - Math.min(a, c);
        } else {
            return c - Math.min(a, b);
        }
    }

    // Método para encontrar el mayor de los tres números
    public static int encontrarMayor(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}



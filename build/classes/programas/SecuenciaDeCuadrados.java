import java.util.Scanner;

public class SecuenciaDeCuadrados {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número entero positivo
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número entero positivo
            System.out.print("Ingresa un numero entero y positivo: ");
            int numero = scanner.nextInt();
            // Validar que el número ingresado sea positivo
            while (numero <= 0) {
                System.out.println("El numero ingresado no es positivo. Intentalo de nuevo.");
                System.out.print("Ingresa un numero entero positivo: ");
                numero = scanner.nextInt();
            }   // Generar secuencia de cuadrados desde 1 hasta el número ingresado
            System.out.println("Secuencia de cuadrados hasta " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                int cuadrado = i * i;
                System.out.println(i + "^2 = " + cuadrado);
            }
            // Cerrar el scanner
        }
    }
}
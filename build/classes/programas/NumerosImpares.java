import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número entero positivo
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese un número entero positivo
            System.out.print("Ingresa un numero entero positivo: ");
            int numero = scanner.nextInt();
            // Validar que el número ingresado sea positivo
            while (numero <= 0) {
                System.out.println("El número ingresado no es positivo. Inténtalo de nuevo.");
                System.out.print("Ingresa un número entero positivo: ");
                numero = scanner.nextInt();
            }   // Usar un bucle do-while para imprimir números impares desde 1 hasta el número ingresado
            int contador = 1;
            System.out.println("Numeros impares hasta " + numero + ":");
            do {
                if (contador % 2 != 0) {  // verificar si el número es impar
                    System.out.print(contador + " ");
                }
                contador++;
            } while (contador <= numero);
            // Cerrar el scanner
        }
    }
}
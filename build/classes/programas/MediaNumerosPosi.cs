import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        double suma = 0;    // Acumulador para la suma de los números positivos
        int cantidad = 0;   // Contador para el número de números positivos ingresados

        System.out.println("Ingresa números positivos uno por uno. El programa terminará cuando ingreses un número negativo.");

        // Bucle para leer números del usuario
        while (true) {
            System.out.print("Introduce un número: ");
            // Leer la entrada del usuario
            double numero = scanner.nextDouble();

            // Verificar si el número es negativo
            if (numero < 0) {
                break;
            }

            // Solo considerar números positivos
            if (numero > 0) {
                suma += numero;
                cantidad++;
            } else {
                System.out.println("Por favor, ingresa solo números positivos.");
            }
        }

        // Verificar si se han ingresado números positivos
        if (cantidad > 0) {
            // Calcular la media
            double media = suma / cantidad;
            System.out.println("La media de los números positivos ingresados es: " + media);
        } else {
            System.out.println("No se han ingresado números positivos.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
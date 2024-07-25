import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar el menú de opciones
            System.out.println("Calculadora Básica");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción (1-5): ");

            int opcion = scanner.nextInt();

            // Verificar la opción seleccionada
            if (opcion == 5) {
                continuar = false;
                System.out.println("¡Gracias por usar la calculadora! Programa terminado.");
                continue;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 5.");
                continue;
            }

            // Solicitar los números al usuario
            System.out.print("Introduce el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();

            // Ejecutar la operación seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    // Manejar la división por cero
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Deseas realizar otra operación? (s/n): ");
            char continuarOperacion = scanner.next().charAt(0);
            if (continuarOperacion != 's' && continuarOperacion != 'S') {
                continuar = false;
                System.out.println("¡Gracias por usar la calculadora! Programa terminado.");
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
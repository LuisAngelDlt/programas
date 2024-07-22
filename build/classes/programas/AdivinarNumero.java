import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números aleatorios
        Random random = new Random();
        // Generar un número aleatorio entre 1 y 100
        int numeroAleatorio = random.nextInt(100) + 1;

        // Crear un objeto Scanner para leer la entrada del usuario
        var scanner = new Scanner(System.in);

        int intento = 0;
        boolean adivinado = false;

        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("He pensado en un número entre 1 y 100. Intenta adivinarlo.");

        // Bucle hasta que el usuario adivine el número
        while (!adivinado) {
            System.out.print("Introduce tu suposición: ");
            // Leer la suposición del usuario
            intento = scanner.nextInt();

            // Comparar la suposición con el número aleatorio
            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                adivinado = true;
            }
        }

        // Cerrar el scanner
        scanner.close();
    }
}
        
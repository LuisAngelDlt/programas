import java.util.Scanner;

public class VocalesOConsonantes {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingresa letras una por una. El programa terminará cuando ingreses un espacio en blanco.");

            // Bucle para leer letras del usuario
            while (true) {
                System.out.print("Introduce una letra: ");
                // Leer la entrada del usuario
                String entrada = scanner.nextLine();

                // Verificar que la entrada no sea un espacio en blanco
                if (entrada.equals(" ")) {
                    System.out.println("Programa terminado.");
                    break;
                }

                // Asegurarse de que la entrada sea una letra única
                if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                    System.out.println("Por favor, ingresa solo una letra.");
                    continue;
                }

                // Convertir la entrada a minúsculas para simplificar la comparación
                char letra = Character.toLowerCase(entrada.charAt(0));

                // Verificar si la letra es una vocal
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println(letra + " es una vocal.");
                } else {
                    System.out.println(letra + " es una consonante.");
                }
            }
        }
    }
}
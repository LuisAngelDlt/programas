import java.util.Scanner;

public class SecuenciaAritmetica {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese el primer número, la diferencia y el número máximo
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese el primer número, la diferencia y el número máximo
            System.out.print("Ingresa el primer numero de la secuencia: ");
            int primerNumero = scanner.nextInt();
            System.out.print("Ingresa la diferencia entre los numeros: ");
            int diferencia = scanner.nextInt();
            System.out.print("Ingresa el numero maximo hasta el cual generar la secuencia: ");
            int numeroMaximo = scanner.nextInt();
            // Validar que el número máximo sea mayor o igual que el primer número
            while (numeroMaximo < primerNumero) {
                System.out.println("El numero maximo debe ser mayor o igual que el primer numero.");
                System.out.print("Ingresa el numero maximo nuevamente: ");
                numeroMaximo = scanner.nextInt();
            }   // Generar y mostrar la secuencia aritmética usando un bucle do-while
            int actual = primerNumero;
            System.out.println("Secuencia aritmetica hasta " + numeroMaximo + ":");
            do {
                System.out.print(actual + " ");
                actual = actual + diferencia;
            } while (actual <= numeroMaximo);
            // Cerrar el scanner
        }
    }
}
import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        int contador = contarDigitos(numero);
        
        System.out.println("El número tiene " + contador + " dígitos.");
    }
    
    public static int contarDigitos(int numero) {
        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        return contador;
    }
}
 6 import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numeroAleatorio = random.nextInt(100) + 1;
        int intento;
        
        System.out.println("Adivina el número entre 1 y 100:");
        
        while (true) {
            intento = scanner.nextInt();
            if (intento < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo:");
            } else if (intento > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo:");
            } else {
                System.out.println("¡Correcto! El número era " + numeroAleatorio);
                break;
            }
        }
    }
}
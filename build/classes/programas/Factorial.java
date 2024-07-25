import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingresa un numero entero positivo:");
            int numero = sc.nextInt();
            
            if (numero <= 0) {
                System.out.println("El numero debe ser entero y positivo.");
            } else {
                // Calcula el factorial
                long resultado = calcularFactorial(numero);
                // Imprime el resultado
                System.out.println("El factorial de " + numero + " es " + resultado);
            }
        }
    }

    // Método para calcular el factorial
    public static long calcularFactorial(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
import java.util.Scanner;

public class EvaluacionCalificacion {

    public static void main(String[] args) {        
// Solicitar al usuario que ingrese la calificación numérica
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario que ingrese la calificación numérica
            System.out.print("Ingresa la calificacion numerica: ");
            int calificacion = scanner.nextInt();
            // Evaluar la calificación e imprimir la letra correspondiente
            if (calificacion >= 90 && calificacion <= 100) {
                System.out.println("La calificacion es: A");
            } else if (calificacion >= 80 && calificacion <= 89) {
                System.out.println("La calificacion es: B");
            } else if (calificacion >= 70 && calificacion <= 79) {
                System.out.println("La calificacion es: C");
            } else if (calificacion >= 60 && calificacion <= 69) {
                System.out.println("La calificacion es: D");
            } else if (calificacion < 60 && calificacion >= 0) {
                System.out.println("La calificacion es: F");
            } else {
                System.out.println("Calificacion invalida. Debe estar entre 0 y 100.");
            }
            // Cerrar el scanner
        }
    }
}
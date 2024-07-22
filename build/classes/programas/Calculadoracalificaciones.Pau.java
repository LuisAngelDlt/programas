1. import java.util.Scanner;

public class CalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double parciales, proyecto, examenFinal, calificacionFinal;
        
        
        System.out.println("Ingrese la calificación de Parciales (0-100): ");
        parciales = obtenerCalificacionValida(scanner);
        
        System.out.println("Ingrese la calificación del Proyecto (0-100): ");
        proyecto = obtenerCalificacionValida(scanner);
        
        System.out.println("Ingrese la calificación del Examen Final (0-100): ");
       
        calificacionFinal = (parciales * 0.40) + (proyecto * 0.30) + (examenFinal * 0.30);
        
        
        System.out.println("La calificación final es: " + calificacionFinal);
    }
    
    public static double obtenerCalificacionValida(Scanner scanner) {
        double calificacion;
        while (true) {
            calificacion = scanner.nextDouble();
            if (calificacion >= 0 && calificacion <= 100) {
                break;
            } else {
                System.out.println("Calificación inválida. Ingrese un valor entre 0 y 100:");
            }
        }
        return calificacion;
    }
}
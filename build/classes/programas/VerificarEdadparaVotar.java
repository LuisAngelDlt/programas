2. import java.util.Scanner;

public class VerificarEdadParaVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad >= 18) {
            System.out.println("Usted es elegible para votar.");
        } else {
            System.out.println("Usted no es elegible para votar.");
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra");
         String palabra = sc.nextLine();

                int contador = 0;
               
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'A') {
                                    contador++;
                                }
                            }
        System.out.println("La letra 'a' aparece " + contador + " veces en la palabra.");
                        }
                    }

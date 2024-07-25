/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programas;

import java.util.Scanner;

/**
 *
 * @author PC 10
 */
public class Cambiar_caracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner sc = new Scanner(System.in);
      System.out.print("Ingresa la cadena de texto: ");
       String texto = sc.nextLine();

        
        System.out.print("Ingresa el caracter que se desea reemplazar: ");
        char caracterBuscar = sc.nextLine().charAt(0); 
        System.out.print("Ingresa el nuevo caracter: ");
        char caracterReemplazo = sc.nextLine().charAt(0);

        String resultado = reemplazarCaracter(texto, caracterBuscar, caracterReemplazo);

        
        System.out.println("El resultado después del reemplazo es: " + resultado);
        
        sc.close();
    }

   
    public static String reemplazarCaracter(String texto, char caracterBuscar, char caracterReemplazo) {
        char[] caracteres = texto.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] == caracterBuscar) {
                caracteres[i] = caracterReemplazo;
            }
        }

        return new String(caracteres);
    }
}

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
public class Calcular_Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la primer calificacion\n");
        float c1 = sc.nextFloat();
        System.out.println("Dame la primer calificacion\n");
        float c2 = sc.nextFloat();
        System.out.println("Dame la primer calificacion\n");
        float c3 = sc.nextFloat();
        float ct = (c1+c2+c3)/3;
        System.out.println("Tu calificacion total es "+ ct );
    }
    
}

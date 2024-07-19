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
public class Indice_de_masacorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcula tu indice de masa corporal\n ");
        System.out.println("Dame tu peso en kilogramos\n");
        float p = sc.nextFloat();
        System.out.println("Dame tu altura en metros\n");
        float a = sc.nextFloat();
        float imc = p/(a*a);
        System.out.println("Tu indice de masa corporal es : "+ imc);
        
    }
    
}

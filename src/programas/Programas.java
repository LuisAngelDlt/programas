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
public class Programas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area de un rectangulo\n ");
        System.out.println("Dame la base del rectangulo\n");
        float a = sc.nextFloat(); //Lee la variable
        System.out.println("Dame la altura del rectangulo\n");
        float b = sc.nextFloat();
        float area = a * b;
        System.out.println("El area del rectangulo es = " + area);
        
    }
    
}

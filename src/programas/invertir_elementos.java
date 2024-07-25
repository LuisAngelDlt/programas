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
public class invertir_elementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int v [] = new int [6];
        for(int i = 0; i < v.length; i ++){
            
            System.out.println("Dame el numero "+ (i+1) +" : ");  
            v[i] = sc.nextInt();
        }
        System.out.println("Los elementos invertidos son ");
        for(int i = v.length -1; i>= 0; i--){
            System.out.println(v[i]+"");
        }
        
    }
}
    


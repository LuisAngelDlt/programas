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
public class precio_con_descuentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double d;
    double pcd;
    System.out.println("De cuanto es el valor del producto: ");
        double p = sc.nextDouble();
        if(p > 100 && p <= 200){
             d = p*.25;
             pcd = p - d;
            System.out.println("El precio del producto es "+ pcd +" con el 10% de descuento ");
            
        }else if (p> 200 && p<=500){
            d = p*.20;
            pcd = p - d;
            System.out.println("El precio del producto es "+ pcd +" con el 20% de descuento ");
        }else if (p >500 ){
          d = p*.25;
          pcd = p - d;
          System.out.println("El precio del producto es "+ pcd +" con el 25% de descuento ");  
        }else {
            System.out.println("El precio del producto es "+ p + " no tiene descuento");  
        }
    
    }
    
}

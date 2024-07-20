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
public class conversor_moneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        double cp;
        System.out.println("Conversor de monedas\n");
        System.out.println("Ingresa la cantidad que desea convertir a la moneda que selecione ");
        c = sc.nextDouble();
        System.out.println("A que moneda desea covertir la cantida ingresada ?");
        System.out.println("1-. Dolar(USD)");
        System.out.println("2-. Euro(EUR)");
        System.out.println("3-. Bath(THB)");
        System.out.println("4-. Yen(JPY)");
        System.out.println("5-. Won(KRW)");
        System.out.println("6-. Dolar Australiano(AUD)");
        System.out.println("7-. Sol(PEN)");
        System.out.println("8-. Dolar Canadiense(CAD)");
        System.out.println("9-. Bolivar(VES)");
        System.out.println("10-. Peso Argentino(ARS)");
        int num = sc.nextInt();
        switch(num){
            case 1:
               cp=c*0.055;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en dolares es "+ cp);
            break;    
            case 2:
                cp = c*0.51;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en euros es "+ cp);
            break;
            case 3:
                cp = c*2.01;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en Bath Tailandes es "+ cp);
            break;
            case 4:
                cp = c*8.72;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en Yen Japones es "+ cp);
            break;
            case 5:
                cp = c*76.94;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en Won surcoreano es "+ cp);                                
            break;                   
            case 6:     
                cp = c*0.083;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en Dolar Australiano es "+ cp);
            break;    
        
            case 7:     
                cp = c*0.21;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en sol peruano es "+ cp);
            break;
            
            case 8:     
                cp = c*0.076;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en Dolar Canadiense es "+ cp);
            break;
            
            case 9:     
                cp = c*0.38;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en Bolivianos es "+ cp);
            break;
            
            case 10:     
                cp = c*51.14;
                System.out.println("La cantidad ingreda de pesos es "+ c +" y en Peso Argentino es "+ cp);
            break;
            default: 
                System.out.println(" Ingrese una opcion correcta");
        }
        
    }
    
}

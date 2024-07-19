/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programas;

import java.util.Scanner;
public class salario_neto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu sueldo bruto : ");
        double sueldo = sc.nextFloat();
        double snsd = 0;
        double isr = 0;
        if (sueldo >=0.01 && sueldo <= 764.04){
          double cf=0;
          double li=0.01;
           isr = (sueldo - li)*0.0192+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=746.05 && sueldo <= 6332.05){
          double cf=14.32;
          double li=746.05;
           isr = (sueldo - li)*0.0640+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=6332.06 && sueldo <= 11128.01){
          double cf=371.83;
          double li=6332.06;
           isr = (sueldo - li)*0.1088+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=11128.02 && sueldo <= 12935.82){
          double cf=893.63;
          double li=11128.02;
           isr = (sueldo - li)*0.16+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=12935.83 && sueldo <= 15487.71){
          double cf=1182.88;
          double li=12935.83;
          isr = (sueldo - li)*0.1792+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=15487.72 && sueldo <= 31236.49){
          double cf=1640.18;
          double li=15487.72;
           isr = (sueldo - li)*0.2136+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=31236.50 && sueldo <= 49233){
          double cf=5004.12;
          double li=31236.50;
           isr = (sueldo - li)*0.2352+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=49233.01 && sueldo <= 93993.90){
          double cf=9236.89;
          double li=49233.01;
          isr = (sueldo - li)*0.30+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=93993.91 && sueldo <= 125325.20){
          double cf=22665.17;
          double li=93993.91;
          isr = (sueldo - li)*0.32+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=125325.21 && sueldo <= 375975.61){
          double cf=32691.18;
          double li=125325.21;
           isr = (sueldo - li)*0.34+cf;
             snsd = sueldo - isr;
        }else if (sueldo >=375975.62){
          double cf=117912.32;
          double li=375975.62;
           isr = (sueldo - li)*0.35+cf;
             snsd = sueldo - isr;
        }else {
            System.out.println("No se puede tiene que ser mayor a 0 :(");
        }
        int sn;
        int i=0;
        double dt=0;
        double sun;
        System.out.println("Tu impusto es de : "+ isr);
        System.out.println("Tiene deducciones adicionales ");
        System.out.println("1.- si");
        System.out.println("2.- no");
        sn = sc.nextInt();
        while (sn == 1){
        i=i+1;
        double d = 0;
            System.out.println("De cuanto es la deduccion "+ i);
             d = sc.nextDouble();
            System.out.println("Tiene mas deducciones ? ");
            System.out.println("1.- si");
            System.out.println("2.- no");
             sn = sc.nextInt();
             dt=dt+d;
             
    }
      sun = snsd - dt;
        System.out.println("Tu sueldo neto es de "+ sun);
        
    }
    
    
}

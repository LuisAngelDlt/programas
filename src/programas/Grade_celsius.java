import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
     System.out.println("Ingresa la temperatura en Grados Celsius");
     int a = sc.nextInt();
     System.out.println("A que deseas convertir 1->Fahrenheit, 2->Kelvin");
     int res = sc.nextInt();
     switch (res){
       case 1:
         System.out.println("La temperatura en Fahrenheit es: " + (a*9/5+32));
         break;
         
       case 2: 
         System.out.println("La temperatura en Kelvin es: " + (a+273.15));
         break;
         default:
         System.out.println("Opcion no valida");
       
     }
   }
}




  

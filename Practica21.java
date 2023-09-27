
package practica2.pkg1;
import java.util.Scanner;

public class Practica21 {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num;
        System.out.println("Introduzca un numero entero ");
        num = scanner.nextInt();
        
        if (num%2 ==0) {
            System.out.println("El numero ingresado es par ");
            
        }else{
            System.out.println("El numero ingresado es impar ");
        }
        scanner.close();
    }
    
}

package fibonacci;
import java.util.Scanner;

public class Fibonacci {
    
      public static void main(String[] args) {
Scanner lectura = new Scanner(System.in);


int primervalor = 0;
int segundovalor = 1;
int valorfibonacci;
int numero;

   System.out.println("Ingrese la cantidad de numeros que desea apreciar ");
   
   numero = lectura.nextInt();

lectura.close();

          for (int i = 0; i <= numero; i++) {
              System.out.println(segundovalor);
              valorfibonacci = primervalor + segundovalor;
              primervalor = segundovalor;
              segundovalor = valorfibonacci;
               
              
               
          }

  
        
        
    }
    
}

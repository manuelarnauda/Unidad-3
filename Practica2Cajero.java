
package practica2cajero;
import java.util.Scanner;

public class Practica2Cajero {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al cajero automatico");
        System.out.println("1 Consultar Saldo");
        System.out.println("2 Depositar Dinero");
        System.out.println("3 Retirar Dinero");
        
        int saldo = 3000;
        int n = scanner.nextInt();
        double deposito;
        double retiro;
        
        switch(n)
        {
        
            case 1: 
                System.out.println("Su saldo es de: " + saldo);
            break;
            
            case 2:
                System.out.println("Ingrese la cantidad que desea depositar: ");
                deposito = scanner.nextDouble();
                double nuevosaldo = saldo + deposito;
                System.out.println("Su nuevo saldo es de: " + nuevosaldo);
            break;
            
            case 3:
                System.out.println("Ingrese la cantidad que desea retirar: ");
                retiro = scanner.nextDouble();
                double actualretiro = saldo - retiro;
                if (saldo >= retiro) {
                    System.out.println("Su saldo despues del retiro es de: " + actualretiro);
                }else{
                    System.out.println("Su saldo es insuficiente");
                    break;
                    
                }
            default: 
                System.out.println("Opcion no valida");
                
                
                scanner.close();
                
            
                
        }
        
        
     
    }
    
}

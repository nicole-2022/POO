package ejercicios;
import java.util.Scanner;

public class EjecutarMDO {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

       do {
            System.out.println(" MENÚ DE OPERACIONES");
            System.out.println("1. Multiplicación");
            System.out.println("2. División");
            System.out.println("3. potenciación");
            System.out.println("4. Radiacación");
            System.out.println("5. Logaritmos");
            System.out.println("6. Seno");
           
            opcion = scanner.nextInt();
        //Capturar datos por teclado
       
        System.out.println("Digite primer número entero...");
        int n1 = scanner.nextInt();
        System.out.println("Digite segundo número entero...");
        int n2 = scanner.nextInt();

        // Crear el objeto
        MenuDeOperaciones objOpe = new MenuDeOperaciones(n1, n2);

    
        switch(opcion) {
            case 1:
                System.out.println("La multiplicación es: " + objOpe.multiplicar());
            break;
            case 2:
                System.out.println("La división es: " + objOpe.dividir());
            break;
            case 3:
            System.out.println("La potencia es: " + objOpe.Potencia());
            break;
            case 4:
            System.out.println("La radicación es: " + objOpe.Radicación());
            break;
            case 5:
            System.out.println("El logaritmo es: "+ objOpe.Logaritmos());
            break;
            case 6:
            System.out.println("Seno es: "+ objOpe.seno());
            break;
            default:
            System.out.println("Opción no válida.");
        }
        
        }while (opcion != 0);
        scanner.close();

     }
    
}

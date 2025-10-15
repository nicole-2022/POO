import java.util.Scanner;

public class EjecutarOpeMat {
    public static void main (String[]args) {

        //Capturar datos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite primer número entero...");
        int n1 = sc.nextInt();
        System.out.println("Digite segundo número entero...");
        int n2 = sc.nextInt();

        //crear el objeto. new le da vida a e objecto
        OperacionesMatematicas objOpe = new OperacionesMatematicas(n1,n2);

        // Acceder al método  sumar
        System.out.println("La suma es: " + objOpe.sumar());
        //Acceder al metodo restar
        System.out.println("La restar es: " + objOpe.restar());
        //Acceder al método Multiplicar
        System.out.println("La Multiplicación es: " + objOpe.Multiplicar());
        //Acceder al método dividir 
        System.out.println("La division es: " + objOpe.Dividir());
        sc.close();
        
    }
    
}

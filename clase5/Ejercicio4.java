import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[]args){

        /*problema 5.4: Determinar la media de una lista de números positivos
        terminada con un número no positivo después del último
        número válido. */
        Scanner scanner = new Scanner(System.in); // Pedir datos por teclado
        double numero;
        int suma = 0;
        int contador = 0;
        System.out.println("introduce los numeros positivos y escribe el ultimo en negativo");

        while (true) {
        numero = scanner.nextDouble();
        if (numero <= 0)break;
         suma += numero;
         contador++;
        }
        if ( contador > 0){
        double media = suma / contador;
        System.out.println("la media de los numeros es: "+ media);

        }else {
        System.out.println("No se ingresaron números positivos.");
      }
      scanner.close();
    }
}

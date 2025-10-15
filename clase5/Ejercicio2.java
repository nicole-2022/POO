import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        /*
      *problema5.2. Dado el nombre de un mes y si el año es o no bisiesto,
      deducir el número de días del mes.
      */
      Scanner scanner = new Scanner(System.in);

      System.out.print("Ingrese el nombre del mes ");
      String mes = scanner.nextLine().toLowerCase();

      System.out.print("¿El año es bisiesto? si o no: ");
      boolean esBisiesto = scanner.nextBoolean();

      int dias;

      switch (mes) {
         case "enero":
         case "marzo":
         case "mayo":
         case "julio":
         case "agosto":
         case "octubre":
         case "diciembre":
            dias = 31;
            break;
         case "abril":
         case "junio":
         case "septiembre":
         case "noviembre":
            dias = 30;
            break;
         case "febrero":
            dias = esBisiesto ? 29 : 28;
         break;
         default:
            System.out.println("Mes inválido.");
         return;
      }

      System.out.println("El mes de " + mes + " tiene " + dias + " días.");
      scanner.close();
         
         
    }
}

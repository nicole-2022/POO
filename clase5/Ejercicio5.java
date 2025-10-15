public class Ejercicio5 {
    public static void main (String[]args){
        /*problema5.5 Imprimir todos los números primos entre 2 y 1.000
        inclusive*/

        for (int num = 2; num <= 1000; num++) {
            if (esPrimo(num)) {
                System.out.println(num);
            }
        }
   }

   public static boolean esPrimo(int numero) {
      if (numero < 2) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(numero); i++) {
         if (numero % i == 0) {
            return false; 
        }
      }
      return true; 
    }
}

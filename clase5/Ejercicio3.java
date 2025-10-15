public class Ejercicio3 {
    public static void main(String[]args){
        /*Problema 5.3 Sumar los números enteros de 1 a 100 mediante: a)
      estructura repetir; b) estructura mientras; c) estructura
      desde*/
      
      int suma = 0;
      int i = 1;
      do {
      suma += i;
      i++;
      } while (i <= 100);
      System.out.println("Suma con repetir: " + suma);

    }
}
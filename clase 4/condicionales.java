import java.util.Scanner;

public class condicionales {
    public static void main(String [] args ) {
        // problema4.1: se necesita validar la edad de una persona mayor de edad ( En 
        // Colombia la mayoria d edad se obtiene al cumplir los 18)

        // Se declara la variable edad de tipo entero
        int edad = 18;

        if (edad >= 18){
            System.out.println("mayor de edad");
        } else {
            System.out.println("menor de edad ");
        }

        /*Problema a: se necesita un angulo es de 90 grados, imprimir el mensaje "EL ÁNGULO ES UN ÁNGULO RECTO" 
        sino imprimir el mensaje"EL ÁNGULO NO ES UN ÁNGULO RECTO".
        */ 

        int angulo = 90;
        
        if (angulo == 90){
            System.out.println("Es un angulo recto");
        } else{
            System.out.println("El angulo no es un angulo recto");
        }

        /*
        * Problema b: si la temperatura es superior a 100 grados, visualizar el mensaje " por enciama del 
        *  pundo de ebullicion del agua" sino visualizar el mensaje " por debajo del punto de ebullicion del agua"
        */

        int temperatura = 80;
        if (temperatura > 100) {
            System.out.println("Por encima de ebullicion del agua ");
            
        } else {
            System.out.println("Por debajo del puto de ebullicion del agua");
        }

        /*
        * problema c. si el numero es positivo, sumar el numero a total de positivos,
        *sino sumar al total de negativos
        */
        int positivos = 0, negativos = 0, numero = -14;
        if (numero >= 0) {
            positivos = positivos + numero; // positivos += numero
            System.out.println("total positivos: " + positivos);
        } else {
            negativos = negativos + numero; // negativos += numero
            System.out.println("Total negativos: " + negativos);
        }
 
        
        /*
        * problema D.Si x es mayor que y, y z es menor que 20, leer
        un valor para p
        * --> si ( x > y && z < 20)

        /*
        *  Problema e: Si distancia es mayor que 20 y menos que 35,
        leer un valor para tiempo
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la distancia: ");
        double distancia = scanner.nextDouble();

        if (distancia > 20 && distancia < 35) {
            System.out.print("La distancia está en el rango válido. Introduce el tiempo: ");
            double tiempo = scanner.nextDouble();
            System.out.println("Tiempo registrado: " + tiempo + " unidades.");
        } else {
            System.out.println("La distancia no está en el rango entre 20 y 35. No se solicita tiempo.");
        }

        
          


        /*
        Pobrema 4.2: Escribir un programa que solicite al usuario introducir dos números.
        Si el primer número introducido es mayor que el segundo número, el programa debe imprimir el mensaje
        El primer númeSro es mayor, en caso contrario el programa debe imprimir el mensaje EL PRIMER NÚMERO ES EL MAS PEQUEÑO,
        Considerar el caso que ambos números sean iguales e imprimir el correspondiente mensaje.
        */
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();
        if (numero1> numero2){
            System.out.println("El primer número es mayor");
        } else if (numero1 < numero2){
            System.out.println("El primer numero es el mas pequeño");
        }  else {
            System.out.println("Ambos números son iguales. ");
        }

        /*Problema 4.3: Dados tres números deducir cuál es el central */

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int c = scanner.nextInt();

        int central;
        if ((a > b && a < c) || (a < b && a > c)) {
            central = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            central = b;
        } else {
            central = c;
        }

        System.out.println("El número central es: " + central);

        /*Problema 4.4: Calcular la raiz cuadrada de un número y escribir su resultado. Considerando el caso
         * en que el número sea negativo.
         */

        System.out.print("Introduce un número: ");
        double Numero = scanner.nextDouble();

        if (Numero < 0) {   
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo en el conjunto de los números reales.");
        } else {
            double raiz = Math.sqrt(Numero);
            System.out.println("La raíz cuadrada de " + Numero + " es: " + raiz);
        }


        /* Problema 4.5 Escribir los diferentes métodos para deducir si una
        variable o expresión numérica es par. */
        int número = 8;
        if ( número % 2 == 0) {
            System.out.println(número + " es un par.");
        } else {
            System.out.println (número + " es impar.");
        }

        /*problema 4.6:Diseñar un programa en el que a partir de una fecha
        introducida por teclado con el formato DIA, MES,
        AÑO se obtenga la fecha del día siguiente. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int año = sc.nextInt();

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            diasPorMes[1] = 29; // febrero tiene 29 días
        }

        dia++;
        if (dia > diasPorMes[mes - 1]) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }

        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);
        sc.close();
        scanner.close();
    
    

    }
    
}

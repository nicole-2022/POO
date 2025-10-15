import java.util.Scanner;

public class condicionales2 {
    public static void main(String [] args ) {
        /* problema 4.7: Se desea realizar una estadística de los pesos de los
        alumnos de un colegio de acuerdo a la siguiente tabla:
        Alumnos de menos de 40 kg.
        Alumnos entre 40 y 50 kg.
        Alumnos de más de 50 kg y menos de 60 kg.
        Alumnos de más o igual a 60 kg. */
        Scanner sc = new Scanner(System.in);
        int[] categorias = new int[4];

        System.out.print("¿Cuántos alumnos? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Peso del alumno " + (i + 1) + ": ");
            double peso = sc.nextDouble();

            if (peso < 40) categorias[0]++;
            else if (peso <= 50) categorias[1]++;
            else if (peso < 60) categorias[2]++;
            else categorias[3]++;
        }

        System.out.println("\n Estadísticas:");
        System.out.println("Menos de 40 kg: " + categorias[0]);
        System.out.println("Entre 40 y 50 kg: " + categorias[1]);
        System.out.println("Más de 50 y menos de 60 kg: " + categorias[2]);
        System.out.println("60 kg o más: " + categorias[3]);


        /* problema4.8: Realizar un algoritmo que averigüe si dados dos números
        introducidos por teclado uno es divisor del otro*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducas el primer numero");
        int n1 = scanner.nextInt();

        System.out.println(" Introdusca el segundo nuemero");
        int n2 = scanner.nextInt();
        if (n1 != 0 && n2 % n1 == 0) {
            System.out.println(n1 + " es divisor de " + n2);
        } else if (n2 != 0 && n1 % n2 == 0) {
            System.out.println(n2 + " es divisor de " + n1);
        } else {
            System.out.println("Ninguno de los dos números es divisor exacto del otro.");
        }
        
        /*
        * Problema 4.9 Un ángulo se considera agudo si es menor de 90
        grados, obtuso si es mayor de 90 grados y recto si
        es igual a 90 grados. Utilizando esta información,
        escribir un algoritmo que acepte un ángulo en grados
        y visualice el tipo de ángulo correspondiente a los
        grados introducidos.
        */
        int m = 90;
        if ( m< 90){
            System.out.println("angulo agudo");
        } else if ( m > 90 ){
            System.out.println("angulo obtuso");
        } else{
            System.out.println(" angulo recto");
        }

        /* Problema 4.10: El sistema de calificación americano (de Estados
        Unidos) se suele calcular de acuerdo al siguiente
        cuadro */

        System.out.print("Ingrese la calificación del estudiante (0-100): ");
        int calificacion = scanner.nextInt();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("La calificación debe estar entre 0 y 100.");
        } else {
            // Determinar la calificación en letra
            String letra;

            if (calificacion >= 90) {
                letra = "A";
            } else if (calificacion >= 80) {
                letra = "B";
            } else if (calificacion >= 70) {
                letra = "C";
            } else if (calificacion >= 69) {
                letra = "D";
                
            } else {
                letra = "F";
            }
            System.out.println("La calificación en letra es: " + letra);
        }

        /* Problema 4 .11 Escribir un programa que seleccione la operación
        aritmética a ejecutar entre dos números dependiendo
        del valor de una variable denominada seleccionOp*/


        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Seleccione la operación (suma, resta, multiplicacion, division): ");
        String seleccionOp = scanner.next().toLowerCase();

        double resultado;
        switch (seleccionOp) {
            case "suma":
                resultado = numero1 + numero2;
                System.out.println("Resultado de la suma: " + resultado);
                break;
            case "resta":
                resultado = numero1 - numero2;
                System.out.println("Resultado de la resta: " + resultado);
                break;
            case "multiplicacion":
                resultado = numero1 * numero2;
                System.out.println("Resultado de la multiplicación: " + resultado);
                break;
            case "division":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado de la división: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Operación no válida. Intente con suma, resta, multiplicacion o division.");
        }


        /* Problema 4.12 Escribir un programa que acepte dos números reales
        de un usuario y un código de selección. Si el código
        introducido de selección es 1, entonces el programa
        suma los dos números introducidos previamente y se
        visualiza el resultado; si el código de selección es 2,
        los números deben ser multiplicados y visualizado
        el resultado; y si el código seleccionado es 3, el primer
        número se debe dividir por el segundo número
        y visualizarse el resultado. */

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingrese el código de operación (1: suma, 2: multiplicación, 3: división): ");
        int codigo = sc.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Resultado de la suma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado de la multiplicación: " + (num1 * num2));
                break;
            case 3:
                if (num2 != 0) {
                    System.out.println("Resultado de la división: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Código inválido. Use 1, 2 o 3.");
        }

        /*Problema 4.13
        *Escribir un algoritmo que visualice el siguiente doble
        mensaje
        */
        System.out.println("Introduzca un mes de 1 a 12");
        if ( ! scanner.hasNextDouble()){
            System.out.println("El numero no es valido como mes");

        }
        double mesInput = scanner.nextDouble();
        int mes = (int) mesInput;

        if (mes != mesInput || mes < 1 || mes > 12 ){
            System.out.println(" El numero introducido no es valido");
        }
        double diaInput = scanner.nextDouble();
        int dia =(int) diaInput; 
        boolean diaValido = false;
        switch (mes) {
            case 2:
                diaValido = dia <= 29; 
                break;
            case 4: case 6: case 9: case 11:
                diaValido = dia <= 30;
                break;
            default:
                diaValido = dia <= 31;
        }

        if (!diaValido) {
            System.out.println("Error: El día introducido no existe en el mes especificado.");
        } else {
            System.out.println("Fecha válida: Mes " + mes + ", Día " + dia);
            }
        /* problema 4.14: Escriba un programa que simule el funcionamiento
        normal de un ascensor (elevador) moderno con 25
        pisos (niveles) y que posee dos botones de SUBIR y
        BAJAR, excepto en el piso (nivel) inferior, que sólo
        existe botón de llamada para SUBIR y en el último
        piso (nivel) que sólo existe botón de BAJAR. */

        int pisoActual = 1; 
        int pisoDestino;

        System.out.println("Ascensor iniciado en el piso " + pisoActual);

        while (true) {
            System.out.println("\nEstás en el piso " + pisoActual);
            System.out.println("¿A qué piso deseas ir? (1-25, 0 para salir): ");
            pisoDestino = scanner.nextInt();

            if (pisoDestino == 0) {
                System.out.println("Saliendo del programa...");
                break;
            }

            if (pisoDestino < 1 || pisoDestino > 25) {
                System.out.println("Piso inválido. Intenta nuevamente.");
                continue;
            }

            if (pisoDestino == pisoActual) {
                System.out.println("Ya estás en ese piso.");
                continue;
            }

            if (pisoActual == 1 && pisoDestino < pisoActual) {
                System.out.println("Solo puedes subir desde el primer piso.");
                continue;
            }

            if (pisoActual == 25 && pisoDestino > pisoActual) {
                System.out.println("Solo puedes bajar desde el piso 25.");
                continue;
            }

            if (pisoDestino > pisoActual) {
                System.out.println("Subiendo...");
            } else {
                System.out.println("Bajando...");
            }

            pisoActual = pisoDestino;
            System.out.println("Has llegado al piso " + pisoActual);
        }

        scanner.close();
        sc.close();
    }
}






import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        while (true) {
        System.out.println("Deseas Subir (1) o bajar(2) en el ascensor \nOpcion (1)\nOpcion (2)  ");
        int direccion = scanner.nextInt();
        System.out.print("Piso en que se encuentra el usuario actualmente: ");
        int getPisoActual = scanner.nextInt();
        System.out.println("\nEl usuario escoge una opcion: ");
       if (direccion == 1) {
            BotonPiso botonPiso = new BotonPiso(getPisoActual, true, false);
            botonPiso.presionar();
        } else {
            BotonPiso botonPiso = new BotonPiso( getPisoActual, false, true);
            botonPiso.presionarBajar();
        }

        PuertaPiso puertaPiso = new PuertaPiso(getPisoActual);
        puertaPiso.abrir();
        PuertaAscensor puertaAscensor = new PuertaAscensor(1);
        puertaAscensor.abrir();
        BotonPiso cancelarIluminacion1 = new BotonPiso(getPisoActual, false, false);
        cancelarIluminacion1.cancelarIluminacion();
        System.out.print("\n¿seleciona un piso a el que decides ir ?(1-20): ");
        int destino = scanner.nextInt();
        
        BotonAscensor boton = new BotonAscensor(destino);
        boton.presionar();
        
        puertaPiso.cerrar();
        puertaAscensor.cerrar();
        
        Controlador controlador = new Controlador(getPisoActual);
        Controlador.moverAutomatico(controlador, destino);
        
        controlador.parar();
        BotonAscensor boton3 = new BotonAscensor(destino);
        boton3.cancelarIluminacion();
       
        puertaAscensor.abrir();

        PuertaPiso puertaPiso2 = new PuertaPiso(destino);
        puertaPiso2.abrir();

        

        System.out.println("Has llegado a tu destino.");
        System.out.println("El ascensor esta en buen funcionamiento");

       System.out.println("\n¿Necesitas tomar el ascensor otra vez?");
            System.out.println("1 = Sí");
            System.out.println("2 = No");
            int repetir = scanner.nextInt();

            if (repetir == 2) {
                System.out.println("Fin del recorrido del ascensor.");
                break; 
            }
        }
    scanner.close();

    }


}

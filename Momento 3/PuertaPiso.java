public class PuertaPiso extends Puerta {
    private int piso;
    
    public boolean detectarObstaculo(boolean hayObstaculo) {
       return false;
    }

    public PuertaPiso(int piso) {
        super();
        this.piso = piso;
    }
    public void abrir() {
        abierta = true;
         System.out.println("Abriendo puertas del piso " + piso);
        
    }
    public void cerrar() {

        if (detectarObstaculo(abierta)) {
            System.out.println("Obstáculo.");
            abrir();
            System.out.println("Obstaculo retirado");  
            return;
        }

        abierta = false;
        System.out.println("No hay obstaculo (No hay errores ni advertencias\nPuertas cerrando).");
    }

    
}

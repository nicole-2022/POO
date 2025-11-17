public class PuertaPiso extends Puerta {
    private int piso;
    private boolean hayObstaculo;
    
    public PuertaPiso(int piso) {
        super();
        this.piso = piso;
        this.hayObstaculo = false;
    }

    public boolean detectarObstaculo() {
        return hayObstaculo;
    }

    @Override
    public void abrir() {
        abierta = true;
        System.out.println("Abriendo puertas del piso " + piso);
        
    }

    @Override
    public void cerrar() {

        if (detectarObstaculo()) {
            System.out.println("Obstáculo "  + hayObstaculo);
            abrir();
            System.out.println("Obstaculo retirado"); 
            hayObstaculo= false; 
            return;
        }

        abierta = false;
        System.out.println("No hay obstaculo (No hay errores ni advertencias)\nCerrando puertas del piso "+ piso);
    }

    
}

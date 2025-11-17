public class PuertaAscensor extends Puerta {
    private int ascensor;

    public PuertaAscensor(int Ascensor) {
        super();
        this.ascensor = Ascensor;
    }
    @Override
    public void abrir() {
        abierta = true;
         System.out.println("Abriendo puertas del ascensor " );
        
    }

    @Override
    public void cerrar() {
        abierta = false;
        System.out.println("Cerrando puertas del Ascensor "); 
        
    }


    public int getAscensor() {
        return ascensor;
    }
}

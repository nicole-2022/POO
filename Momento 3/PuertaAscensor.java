public class PuertaAscensor extends Puerta {
    private int Ascensor;

    public PuertaAscensor(int Ascensor) {
        super();
        this.Ascensor = Ascensor;
    }

    public void abrir() {
        abierta = true;
         System.out.println("Abriendo puertas del ascensor " );
        
    }

     public void cerrar() {
        abierta = false;
        System.out.println("Cerrando puertas del Ascensor "); 
        
    }


    public int getAscensor() {
        return Ascensor;
    }
}

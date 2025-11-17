public class BotonAscensor extends Boton {
    private int destino;
   
    public BotonAscensor(int destino) {
        super();
        this.destino = destino;
    }

    public int getDestino() {
        return destino;
    }
    @Override
    public void presionar() {
        iluminado = true;
        System.out.println("Botón del ascensor para el piso " + destino + " presionado iluminado");
        
    }
    @Override
   public void cancelarIluminacion() {
        iluminado = false;
        System.out.println("Iluminación del botón del ascensor (Apagado)");
    } 
}

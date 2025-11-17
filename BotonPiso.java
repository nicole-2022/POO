public class BotonPiso extends Boton {
    private int piso;
    private boolean direccionSubida;
    private boolean direccionBajada;
    

    public BotonPiso(int piso, boolean direccionSubida, boolean direccionBajada) {
        super();
        this.piso = piso;
        this.direccionSubida = direccionSubida;
        this.direccionBajada = direccionBajada;
    
    }
    @Override
    public void presionar() {
        iluminado = true;
        System.out.println("Botón del piso " + piso + " en direcion SUBIR "+ direccionSubida  + "\nBoton  (iluminado)");
        
    }
    public void presionarBajar() {
        iluminado = true;
        System.out.println("Botón del piso " +  piso  + " en direción Bajar " + direccionBajada + "\nBoton  (iluminado)");
        
    }
   
   @Override
   public void cancelarIluminacion() {
        iluminado = false;
        System.out.println("Iluminación del botón del piso  (Apagada)");
    } 

    
}

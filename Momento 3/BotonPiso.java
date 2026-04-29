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
        System.out.println("Botónes del piso " + piso + (direccionSubida ? " en direcion SUBIR " : "BAJAR") + " (Boton iluminado)");
        
    }
    public void presionarBajar() {
        iluminado = true;
        System.out.println("Botónes del piso " +  piso  +  (direccionBajada ? " en direción Bajar " :    "subir" ) + " (Boton iluminado)");
        
    }
   
   

    
}


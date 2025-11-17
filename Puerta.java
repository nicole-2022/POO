public abstract class Puerta  {
    protected boolean abierta;
    public Puerta() {
        this.abierta = false;
    }

    public void abrir() {
        abierta = true;
         System.out.println("Abriendo puertas");
        
    }

    public void cerrar() {
        abierta = false;
        System.out.println("Puertas cerrando");
        
    }

    
}

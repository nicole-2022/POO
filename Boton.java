public abstract class Boton {
    protected boolean iluminado;

    public Boton() {
        this.iluminado = false;
    }

    public void presionar() {
        iluminado = true;
        System.out.println(" iluminación del boton ( encendido)");
    }

    public void cancelarIluminacion() {
        iluminado = false;
        System.out.println("Iluminación del botón (Apagada)");
    }

   
}


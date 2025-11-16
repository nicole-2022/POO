public  class Boton {
    protected boolean iluminado;

    public Boton() {
        this.iluminado = true;
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


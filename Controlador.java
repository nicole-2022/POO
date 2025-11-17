public class Controlador {
    private int pisoActual;
    private boolean subiendo;
    private boolean detenido;
    private boolean bajando;
    
    
    public Controlador(int pisoInicial) {
        this.pisoActual = pisoInicial;
        this.subiendo = true;
        this.detenido = true;
        this.bajando = false;
    }

    public static void moverAutomatico(Controlador control, int destino) {
        while (control.getPisoActual() < destino) {
            control.mover();
        }
        while (control.getPisoActual() > destino) {
            control.moverBajado();
        }
    }


    public void mover() {
        detenido = false;
        System.out.println("piso actual " + pisoActual + "\nDestino: " + (subiendo?"Subiendo": "bajando"));
        ++pisoActual;
    }
    public void moverBajado() {
        detenido = false;
        System.out.println("piso actual " + pisoActual + "\nDestino: " + (bajando?"Subiendo": "bajando"));
        --pisoActual;
    }
    public void parar() {
        
        detenido = true;
        System.out.println("Ascensor detenido en piso " + pisoActual);
    }

   
    public boolean Subiendo() {
        return subiendo;
    }

    public boolean Detenido() {
        return detenido;
    }

    public int getPisoActual() {
        return pisoActual;
    }
}    


public class Cliente {
   
    private int cedula;
    private String nombre;
   
    public Cliente(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }
 
    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre= " + nombre + "}";
    }
}
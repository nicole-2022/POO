import java.util.Date;


public class Pedido {
    
    private Cliente cliente;
    private Producto[] producto;
    private Date fecha;
    private int numeroTarjetaCredito;

    
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito ){
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
    public void mostrarPedido() {
        System.out.println(" PEDIDO");
        System.out.println("Cliente" + cliente );
        System.out.println("Fecha: " + fecha);
        System.out.println("Producto:" + producto);
        for (Producto p : producto) {
            System.out.println(" - " + p); 
        }
        System.out.println("Numero de tarjeta de credito: " + numeroTarjetaCredito);
        
    }
    
    
}

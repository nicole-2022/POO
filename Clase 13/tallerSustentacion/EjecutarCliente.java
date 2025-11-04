import java.util.Date;
public class EjecutarCliente {
    public static void main (String [] args ) {

        Cliente Cliente = new Cliente("136258954", "Luisa cortez");
        Cliente.setCedula("183472144");
        
        Producto producto1 = new Producto(505);
        Producto producto2 = new Producto(26);

        Pedido pedido = new Pedido(Cliente, new Producto[]{producto1, producto2}, new Date() , 105692274);
        pedido.mostrarPedido();

        Camara Camara = new Camara("Nikon", "D3500");
        Foto fotoGenerada = Camara.tomarFoto("Naturaleza");

        Impresion impr = new Impresion( "blaco y negro", fotoGenerada);
        impr.realizarImpresion();
        


    }
    
}

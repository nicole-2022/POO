public class producto2 {
    public static void main(String[] args){
    
    
    Producto producto = new Producto("0874", "jabon ", 2, 2500);


   producto.aplicarDescuento(5);
   System.out.println(producto.toString());


  }
    
}

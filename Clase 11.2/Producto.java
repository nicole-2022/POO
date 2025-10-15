public class Producto {
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor 
    public Producto() {
        this.codigo = "23254";
        this.descripcion = "no hay producto";
        this.cantidad = 1;
        this.precioUnitario = 0;
    }

    
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion ;
        this.cantidad =  cantidad  ;
        this.precioUnitario =precioUnitario;
    }

    // Gett
    public String getCodigo() { 
        return codigo; 
    }

    public String getDescripcion() { 
        return descripcion; 
    }

    public int getCantidad() {
        return cantidad; 
    }

    public double getPrecioUnitario() {
        return precioUnitario; 
    }
    // set

    public void setCodigo(String codigo) {
         if (codigo != null)
          this.codigo = codigo;
     }

    
    public void setDescripcion(String descripcion) {
        if (descripcion != null)
         this.descripcion = descripcion; 
    }

    
    public void setCantidad(int cantidad) {
        if (cantidad >= 1) 
        this.cantidad = cantidad; 
    }

    
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario >= 0) 
        this.precioUnitario = precioUnitario; 
    }

    
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 50) {
            precioUnitario -= precioUnitario * (porcentaje / 100);
        }
    }

    public void incrementarCantidad(int valor) {
        if (valor > 0) cantidad += valor;
    }
    public double calcularTotalConImpuesto() {
    double subtotal = calcularSubtotal();
    return subtotal * 1.08;
}


    public String toString() {
        return "producto [ Codigo: " + codigo + " Descripción: " + descripcion +
               " Cantidad: " + cantidad + " Precio: " + precioUnitario +
               " Subtotal: " + calcularSubtotal() + " ]";
    }
}


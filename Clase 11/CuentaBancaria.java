public class CuentaBancaria {
    // Atributos privados
    private String titular;
    private String numeroCuenta;
    private double saldo;
    

    // Constructor 
    public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            this.titular = "No tiene un titular";
        }

        if (numeroCuenta.length() >= 6) {
            this.numeroCuenta = numeroCuenta;
        } else {
            this.numeroCuenta = "050203";
        }
        this.saldo = saldo;

        
    }

    // Get metodo
    public String getTitular() {
        return titular; 
    }
    public String getNumeroCuenta() { 
        return numeroCuenta; 
    }
    public double getSaldo() {
        return saldo; 
    }
    

     // set metodo
    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    public void setNumeroCuenta(String numeroCuenta) {
        
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) 
        this.saldo = saldo;
    }

     
    // Método depositar
    public void depositar(double monto) {
        if (monto > 0)
         saldo += monto;
    }

    // Método retirar
    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto)
         saldo -= monto;
    }

    // Método toString
    
    public String toString() {
        return "CuentaBancaria [Titular: " + titular + " Cuenta: " + numeroCuenta + " Saldo: " + saldo+  "]";
    }

    
}

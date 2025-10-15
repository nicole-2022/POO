public class Cuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("sofi", "010508", 250);
        CuentaBancaria cuenta2 = new CuentaBancaria("Laura", "0502", 100);
        CuentaBancaria cuenta3 = new CuentaBancaria("meri", "0408", 200);


        cuenta1.depositar(70);
        cuenta1.retirar(40);

        cuenta2.depositar(60); 
        cuenta2.retirar(10);  

        cuenta3.depositar(80);
        cuenta3.retirar(20);

        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());


    }
}

    


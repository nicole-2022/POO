public class OperacionesMatematicas {
    // atributos de la clase 
    private int a;
    private int b;

    // constructor: permite inicializar la clase
    public OperacionesMatematicas(int a, int b){
        this.a = a;
        this.b = b;

    }

    //Métodos
    public int sumar(){
        return a + b;
    }
    
    public int restar(){
        return a -b;
    }

    public int Multiplicar(){
        return a * b;
    }
         
    public double Dividir(){
        double resultado;
        if ( b== 0){
            resultado = 0.0;

        } else {
            // (DOUBLE) significa hacer una conversion de entero a un real(CAST)
            resultado= (double) a / (double) b;

        }
        return resultado;
    }
    // metodo para resivir numeror enteros por teclado 
    
}

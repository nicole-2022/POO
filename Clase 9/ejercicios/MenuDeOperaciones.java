package ejercicios;

public class MenuDeOperaciones {
    // Atributos de la clase
    private int a;
    private int b;

    // Constructor: permite inicializar la clase
    public MenuDeOperaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Métodos
    
    public int multiplicar() {
        return a * b;
    }

    public double dividir() {
        double resultado;
        if (b == 0) {
            resultado = 0.0;
        } else {
            // (double) significa hacer una conversión de entero a real (CAST)
            resultado = (double) a / (double) b;
        }
        return resultado;
    }
    public double Potencia(){
        return Math.pow(a, b);
          
    }

    public double Radicación (){
        if (a >= 0){
            return Math.sqrt(a);
        }else{
            System.out.println("no se puede calcular la raíz de un número negativo.");
        return -1;
            
        }
    }
    public double Logaritmos(){
        if (b > 0) {
            return Math.log10(b);
        } else {
        System.out.println("Error: el logaritmo solo se define para números positivos.");
        return -1;
        }
                    
    }
    public double seno() {
    return Math.sin(a);
}
}

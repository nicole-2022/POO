public class EjecutarHerencia {
    public static void main (String [] args ) {
        Animal lucas = new Perro ();
        Animal ceniza = new Gato ();
        
        // hacer sonido es la materializacion del polimorfismo,
        // la capacidad que tiene un metodo de comportarse 
        // según quien lo llame
        
        lucas.hacerSonido();
        ceniza.hacerSonido();
    }

    
}

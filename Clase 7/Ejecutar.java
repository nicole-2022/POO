public class Ejecutar {
    public static void main(String[] args) {
        
        
        Persona objPersona1 = new Persona("Fernanda", "vasquez", 19, 1086922172, 59.0, 1.56, "soltero"
        , "colombia");
        Persona objPersona2 = new Persona("David", "Quiñones" , 20, 1086924115, 65.0, 1.85, "soltero",
         "colombia" );
        Persona objPersona3= new Persona("lusia", "Martinez", 25, 1084925117, 61,1.65,"soltera",
        "colombia");
        
        System.out.println(objPersona1.toString()); 
        
        
        System.out.println(objPersona1.getNombre());

        
        objPersona2.setNombre("Mario"); 

        
        System.out.println(objPersona2.toString());

        System.out.println(objPersona1.Saludar()); 
        System.out.println(objPersona2.Saludar());
        System.out.println(objPersona3.Saludar());

        
        System.out.println("Fernanda es mayor de edad: " + objPersona1.EsMayorEdad());
        System.out.println("David es mayor de edad: " + objPersona2.EsMayorEdad());
        System.out.println("Luisa es mayor de edad: " + objPersona3.EsMayorEdad());

        
        System.out.println("IMC de Ana: " + objPersona1.CalcularImc());
        System.out.println("IMC de Luis: " + objPersona2.CalcularImc());
        System.out.println("IMC de Carla: " + objPersona3.CalcularImc());

    }
}
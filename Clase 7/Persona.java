public class Persona {
    

   
    private String nombre;
    private String apellido;
    private int edad;
    private int cedula;
    private double peso;
    private double altura;
    private String estadoCivil;
    private String nacionalidad;

    
    public Persona(String nombre, String apellido, int edad, int cedula, double peso, double altura, String estadoCivil, String nacionalidad ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
    }

    
    public String getNombre(){ 
        return nombre;
    }
    public double getAltura(){
        return altura;
    }
    public String getEstadoCivil(){
        return estadoCivil;   
    }
    public String getNacionalidad(){
        return nacionalidad;
    }

    public void setNombre(String nombre){ //Modificar el nombre
        this.nombre = nombre;
    }
    public void setAltura (double altura){
        this.altura = altura;
    }
    public void setEstadoCivil( String estadoCivil){
        this.estadoCivil = estadoCivil;

    }
    public void setNacionalidad (String nacionalidad){
    this.nacionalidad = nacionalidad;
    }

    //El método toString sirve para visualizar los objetos
    public String toString() {
        return "Persona [ Nombre: " + nombre + " Apellido: " + apellido +
                " Edad: " + edad + " Cédula: " + cedula + " Peso: " + peso +" Altura: " + altura + " EstadoCivil: " +  estadoCivil + 
                " Nacionalidad: " + nacionalidad + "]";
    }
    public String Saludar (){
        return " Hello, mi nombre es: " + nombre;
    }
    public boolean EsMayorEdad (){
        return edad >= 18;
    }
    public double CalcularImc(){
        return peso  / (altura  * altura );
    }


}

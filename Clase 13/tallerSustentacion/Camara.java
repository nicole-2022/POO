public class Camara {
  private String marca;
  private String modelo;
  
  public Camara (String marca, String modelo){
    this.marca = marca;
    this.modelo = modelo;

  }

  public Foto tomarFoto(String nombreFichero) {
    String nombreFinal = marca + "" + modelo + "" + nombreFichero;
     System.out.println(" Camara " + modelo + " Foto tomada: " + nombreFinal);
    return new Foto(nombreFinal);  
  }
    @Override
    public String toString() {
        return "Camara{" + " marca " + marca  + ", modelo " + modelo  +  "}";
    }
}

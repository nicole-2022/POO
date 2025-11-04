public class Impresion {
    private String color;
    private Foto foto;

    public Impresion (String color, Foto foto){
        this.color = color;
        this.foto = foto;
    }
    public String getColor() {
        return color;
    }

    public void realizarImpresion() {
        System.out.println("Impresión a color: " + color);
        if (foto != null) { 
            foto.print(); 
        } else {
            System.out.println("No hay foto");
        } 
    }
    
}

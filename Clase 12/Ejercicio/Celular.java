public class Celular {

    protected String marca;
    protected String modelo;
    protected int camara;
    protected int almacenamiento;
    
    public Celular (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.camara = 0;
        this.almacenamiento = 0;
    }
       

    public void camara(){
        camara += 0;
    }
    public void almacenamiento() {
      almacenamiento += 0;
    } 

    public String info () {
        return " Celular" + marca +" Modelo " + modelo + "almacenamiento" + almacenamiento+ "camara" + camara ;

     }



    

}
public class Celular {

    protected String marca;
    protected String modelo;
    protected String camara;
    protected String almacenamiento;

    public Celular (String marca){
        this.marca = marca;
        this.modelo = modelo;
        this.camara = camara;
        this.almacenamiento = almacenamiento;
    }

    public void camara(){
        camara += 5;
    }
    public void almacenamiento() {
      almacenamiento += 567;
    } 

    public String info () {
        return " Celular" + marca +"almacenamiento" + almacenamiento+ "camara" + camara ;

     }



    

}
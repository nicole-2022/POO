public class iPhone extends Celular {
    private String marca;
    private String modelo;

    private String camara;
    private String almacenamiento;

    public iPhone (String marca, String modelo, String camara, String almacenamiento){
        super (marca);
        this.modelo = modelo;
        this.camara = camara;
        this.almacenamiento = almacenamiento;
    }
    @Override
    public void camara (){
        camara += 5;
    }

    @ Override 
    public void almacenamiento(){
        almacenamiento += 250;
    }

    @Override
    public String info(){
        return " iPhone" +  marca +"almacenamiento" + almacenamiento+ "camara" + camara  ;
 
    }
}

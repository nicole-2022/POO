public class Android extends Celular {
    private String marca;
    private String modelo;

    private String camara;
    private String almacenamiento;

    public Android (String marca, String modelo, String camara, String almacenamiento){
        super (marca);
        this.modelo = modelo;
        this.camara = camara;
        this.almacenamiento = almacenamiento;
    }
    @Override
    public void camara (){
        camara += 45; 
    }

    @ Override 
    public void almacenamiento(){
        almacenamiento += 320;
    }

    @Override
    public String info(){
        return " Android" +  marca +"almacenamiento" + almacenamiento+ "camara" + camara + "MP";
    }
 

} 
public class iPhone extends Celular {
    

    public iPhone (String marca, String modelo){
        super (marca, modelo);
        
        
    }
    @Override
    public void camara (){
        camara += 15;
    }

    @Override 
    public void almacenamiento(){
        almacenamiento += 215;
    }

    @Override
    public String info(){
        return " iPhone" +  marca + " modelo" + modelo + " almacenamiento " + almacenamiento+ " gb" + " camara " + camara + "mp"  ;
 
    }
}

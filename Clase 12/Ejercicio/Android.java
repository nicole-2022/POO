public class Android extends Celular {
    
    public Android (String marca, String modelo ){
        super (marca, modelo);
        
        
    }
    @Override
    public void camara (){
        camara += 25; 
    }

    @Override 
    public void almacenamiento(){
        almacenamiento += 125;
    }

    @Override
    public String info(){
        return " Android " +  marca + " modelo " + modelo + " almacenamiento " + almacenamiento+ "GB" + " camara " + camara + " MP " ;
    }
 

} 
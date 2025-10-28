public class EjecutarCelular {
    
    public static void main (String[] args ){
       Celular c1 = new iPhone ( " Apple",  " iPhone 13 Pro Max");
        Celular c2 = new Android ( " Samsung",  " Galaxy A35");
       c1.camara();
       c2.camara();
       c1.almacenamiento();
       c2.almacenamiento();



       System.out.println(c1.info());
        System.out.println(c2.info());
    }
}

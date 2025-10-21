public class EjecutarCelular {
    
    public static void main (String[] args ){
       Celular c1 = new iPhone (" Apple",  " iPhone 13 Pro Max", " 12 MP",  " 128 GB");
        Celular c2 = new Android (" Samsung",  " Galaxy A35", " 64 MP",   " 256 GB");
       c1.camara();
       c2.almacenamiento();

       System.out.println(c1.info());
    System.out.println(c2.info());
    }
}

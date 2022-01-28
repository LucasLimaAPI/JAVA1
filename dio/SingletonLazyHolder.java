package dio;

public class SingletonLazyHolder {
    /**
     *  Singleton "apressado"
     */
    private static class instanceHolder{
     private static SingletonLazyHolder instancia = new SingletonLazyHolder(); 
    }

    public SingletonLazyHolder() {
        super();
    }
    public static  SingletonLazyHolder getInstacia(){
       
        return instanceHolder.instancia;
    }

     

    
}

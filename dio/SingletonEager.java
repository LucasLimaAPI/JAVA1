package dio;

public class SingletonEager {
    /**
     *  Singleton "apressado"
     */

     private static SingletonEager instancia = new SingletonEager(); 

    private SingletonEager() {
        super();
    }

    
    public static SingletonEager getInstancia() {
        return instancia;
    }



    
}

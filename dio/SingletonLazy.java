package dio;

public class SingletonLazy {
    /**
     *  Singleton "preguiçoso"
     */

     private static SingletonLazy instancia;

    public SingletonLazy() {
        super();
    }
    public static  SingletonLazy getSingletonLazy(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
    public static SingletonLazy getInstancia() {
        return null;
    }

     

    
}

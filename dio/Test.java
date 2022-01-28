package dio;

import dio.facade.Facade;
import dio.stategy.Comportamento;
import dio.stategy.ComportamentoAgressivo;
import dio.stategy.ComportamentoDefensivo;
import dio.stategy.ComportamentoNormal;
import dio.stategy.Robo;

public class Test {

    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getSingletonLazy();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        //strategy
        Comportamento defesivo =  new ComportamentoDefensivo();
        Comportamento normal =  new ComportamentoNormal();
        Comportamento ofensivo =  new ComportamentoAgressivo();

        Robo robo  = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defesivo);
        robo.mover();
        robo.setStrategy(ofensivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //facade
        Facade facade = new Facade();
        facade.migrarCliente("Lucas", "5646542154");



    }
}
import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
    public static void main(String[] args) {
        
        //Test Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

       
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        lazy = SingletonLazy.getInstancia();
        System.out.println(eager);

      
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        lazy = SingletonLazy.getInstancia();
        System.out.println(holder);

        //Test Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        
        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(normal);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();


        //teste Facade

        Facade facade = new Facade();
        facade.migrarCliente("Felipe", "1455510");


    }
}

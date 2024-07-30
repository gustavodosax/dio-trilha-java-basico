package one.digitalinnovation.gof;

import one.digitalinnovation.gof.sigleton.SingletonEager;
import one.digitalinnovation.gof.sigleton.SingletonLazyHolder;
import one.digitalinnovation.gof.sigleton.Singletonazy;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class test {

    public static void main(String[] args) {
        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder);
        
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(singletonLazyHolder2);
        
        Singletonazy singletonazy = Singletonazy.getInstancia();
        System.out.println(singletonazy);
        
        Singletonazy singletonazy2 = Singletonazy.getInstancia();
        System.out.println(singletonazy2);
        
        SingletonEager singletonEager = SingletonEager.getInstancia();
        System.out.println(singletonEager);
        
        SingletonEager singletonEager2 = SingletonEager.getInstancia();
        System.out.println(singletonEager2);

        Comportamento normal = new ComportamentoNormal();
        
        Comportamento agressivo = new ComportamentoAgressivo();
        
        Comportamento defensivo = new ComportamentoDefensivo();
        
        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
    }
    
}

package one.digitalinnovation.gof.sigleton;


public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

    
    
}

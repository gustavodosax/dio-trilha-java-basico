package one.digitalinnovation.gof.sigleton;


public class SingletonLazyHolder {
    
    private SingletonLazyHolder() {
    }
    
    private static class InstanceHolder {
        private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}

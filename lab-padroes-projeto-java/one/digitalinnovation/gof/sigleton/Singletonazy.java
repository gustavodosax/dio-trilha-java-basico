package one.digitalinnovation.gof.sigleton;

public class Singletonazy {

    private static Singletonazy instancia;

    private Singletonazy() {
    }

    public static Singletonazy getInstancia() {
        if (instancia == null) {
            instancia = new Singletonazy();
        }
        return instancia;
    }
    
}

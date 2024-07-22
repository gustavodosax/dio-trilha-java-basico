import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente gustavo = new Cliente();
        gustavo.setNome("Gustavo");

        Conta cc = new ContaCorrente(gustavo);
        Conta cp = new ContaPoupanca(gustavo);

        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");
        banco.setContas(new ArrayList<>(List.of(cc, cp)));

        cc.depositar(1000);
        cp.depositar(500);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(100, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        


        banco.mostrarListaDeContas();

        
    }
    
}

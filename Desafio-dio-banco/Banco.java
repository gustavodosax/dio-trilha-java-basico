import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void mostrarListaDeContas() {
        for (Conta conta : contas) {
            
            System.out.println("Conta: " + conta.getClass().getSimpleName());
            System.out.println("Cliente: " + conta.getCliente().getNome());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Número: " + conta.getNumero());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("");
        }
    }

    
    
}

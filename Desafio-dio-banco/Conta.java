public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0;
    protected Cliente cliente;

    
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++; 
        this.cliente = cliente;
    }
    
    
    @Override
    public void sacar(double valor) {
        if ( saldo < valor) {
            System.out.println("Saldo insuficiente. Saque não concluído.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " concluído com sucesso.");
        }    
    }


    @Override
    public void depositar(double valor) {
        saldo += valor;
    }


    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente. Transferência não concluída.");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de " + valor + " concluída com sucesso.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {

        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("");

    }
}

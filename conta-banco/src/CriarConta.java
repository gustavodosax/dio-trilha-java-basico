public class CriarConta {

    private int numeroConta = 0;
    private String agencia = "";
    private String nomeCliente = "";
    private double saldo = 0.0;
    
    public CriarConta(int numeroConta, String agencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia ) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
       

    public double sacarSaldo(double sacar) {
        if (sacar > saldo) {
            System.out.println("Saldo insuficiente!");
            System.out.println("Seu saldo atual é: " + saldo);
            return saldo;
        }
        else {
        
        System.out.println("Sacando saldo....");
        System.out.println("Saldo sacado com sucesso!");
        System.out.println("Você sacou: " + sacar);         
        return saldo;

        }
    }

    public double saldoAtual(double sacar) {
        saldo-= sacar;
        System.out.println("Seu saldo atual é: " + saldo);
        return saldo;
    }
    
}

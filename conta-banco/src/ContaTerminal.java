import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        int numeroConta;
        String agencia ;
        String nomeCliente ;
        double saldo;

        
        System.out.println("Por favor, digite o número da Conta !");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        saldo = scanner.nextDouble();

        CriarConta conta1 = new CriarConta(numeroConta, agencia, nomeCliente, saldo);

        System.out.println("Olá " + conta1.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta1.getAgencia() + ", conta " + conta1.getNumeroConta() + " e seu saldo " + conta1.getSaldo() + " já está disponível para saque.");

        System.out.println("Por favor, digite o valor que deseja sacar: ");
        double sacar = scanner.nextDouble();

        scanner.close();

        conta1.sacarSaldo(sacar);
                        
    }
}

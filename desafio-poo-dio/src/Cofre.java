import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {
    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            // Lê a senha configurada para o cofre digital
            int senhaConfigurada = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senhaConfigurada);
            cofreDigital.imprimirInformacoes();

            // Lê a senha fornecida pelo usuário para validação
            int senhaFornecida = scanner.nextInt();

            if (!cofreDigital.validarSenha(senhaFornecida)) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Cofre aberto!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
            
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double salario = 0;
        double salarioLiquido = 0;
        final float VALE_TRANSPORTE = 0.06f;
        final double INSS = 0.09;
        boolean optouValeTransporte = false;
        

        System.out.println("Digite seu salario:");
        salario = scanner.nextDouble();        

        System.out.println("Seu salario é: " + salario);
        System.out.println("O valor do vale transporte é: " + salario * VALE_TRANSPORTE);

        System.out.println("Você deseja optar pelo vale transporte? (true/false)");
        optouValeTransporte = scanner.nextBoolean();

        scanner.close();
        
        double salarioDesc = salario - (salario * VALE_TRANSPORTE);
        double descInss = salario * INSS;

        System.out.println("O desconto do Inss é: " + descInss);

        salarioDesc = salarioDesc - descInss;

        if (optouValeTransporte) {
            System.out.println("Seu salario com desconto do vale transporte e Inss é: " + salarioDesc);

        } else {
            salarioLiquido = salario - descInss;
            System.out.println("Seu salario com desconto do Inss é: " + salarioLiquido);
        }       

      

        double fgts = salario * 0.08;

        System.out.println("O valor do FGTS depositado pela empresa é: " + fgts);           


        
    }
}

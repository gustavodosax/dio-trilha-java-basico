import java.util.Scanner;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double salario = 0;
        final float VALE_TRANSPORTE = 0.06f;
        final double INSS = 0.09;
        

        System.out.println("Digite seu salario:");
        salario = scanner.nextDouble();

        scanner.close();

        System.out.println("Seu salario é: " + salario);
        System.out.println("O valor do vale transporte é: " + salario * VALE_TRANSPORTE);

        
        double salarioDesc = salario - (salario * VALE_TRANSPORTE);
        double descInss = salario * INSS;

        System.out.println("O desconto do Inss é: " + descInss);

        salarioDesc = salarioDesc - descInss;
        

        System.out.println("Seu salario com desconto do vale transporte e Inss é: " + salarioDesc);

        double fgts = salario * 0.08;

        System.out.println("O valor do FGTS depositado pela empresa é: " + fgts);
        




        


        
    }
}

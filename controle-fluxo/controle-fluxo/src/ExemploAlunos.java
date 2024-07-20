public class ExemploAlunos {
    
    public static void main(String[] args) {
        // Declaração e inicialização do array de Strings com os nomes dos alunos
        String alunos []= {"Ana", "Bia", "Caio", "Duda", "Eva"};

        // Loop que percorre cada elemento do array alunos
        for (int i = 0; i < alunos.length; i++) {
            // Imprime o nome do aluno atual (usando o índice i) e a mensagem "presente"
            System.out.println("Aluno " + alunos[i] + " presente");
        }
    }
}

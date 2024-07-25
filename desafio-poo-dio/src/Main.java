import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do curso de Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGustavo = new Dev();
        devGustavo.inscreverBootcamp(bootcamp);
        devGustavo.setNome("Gustavo");
        System.out.println("--------");
        System.out.println("Conteudos inscritos Gustavo: " + devGustavo.getConteudosInscritos());
        System.out.println("--------");
        devGustavo.progredir();
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("Conteudos Concluídos Gustavo: " + devGustavo.getConteudosConcluidos());
        System.out.println("XP Gustavo: " + devGustavo.calcularTotalXp());

        System.out.println("--------");

        Dev devCamila = new Dev();
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.setNome("Camila");
        System.out.println("--------");
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("--------");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Camila: " + devCamila.calcularTotalXp());


    }
    
}

package exercicios.POO.Exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Junior", 1234, 100);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getNotaFinal());

        aluno1.setNome("Junior Neymar");

        System.out.println(aluno1.getNome());

        aluno1.exibirInfo();

    }
}

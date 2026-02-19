package exercicios.POO.Exercicio05;

public class Exercicio05 {
    public static void main(String[] args) {
        LivroBiblioteca livro1 = new LivroBiblioteca();

        livro1.setTitulo("Java: como programar");

        livro1.devolver();
        livro1.pegarEmprestado();
        livro1.pegarEmprestado();
        livro1.devolver();
    }
}

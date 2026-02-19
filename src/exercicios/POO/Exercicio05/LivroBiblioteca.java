package exercicios.POO.Exercicio05;

public class LivroBiblioteca {

    private String titulo;
    private String autor;
    private boolean disponivel = true;


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        if(titulo != null && !titulo.isEmpty()){
            this.titulo = titulo;
        } else {
            System.out.println("Titulo inválido");
        }
    }

    public boolean estaDisponivel(){
        return disponivel;
    }

    public void pegarEmprestado(){
        if(disponivel){
            this.disponivel = false;
            System.out.println("Voce pegou emprestado o livro: " + titulo);
        } else {
            System.out.println("O livro não está disponivel");
        }
    }

    public void devolver(){
        if(!disponivel){
            this.disponivel = true;
            System.out.println("Voce devolveu o livro: " + titulo);
        } else {
            System.out.println("O livro " + titulo + " , já está disponivel!");
        }
    }


}

package exercicios.AvancandoPOO.Exercicio03;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, String som, String raca){
        super(nome, som);

        this.raca = raca;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do cachorro: " + nome );
        System.out.println("Som do cachorro: " + som );
        System.out.println("raca do cachorro: " + raca );
    }
}

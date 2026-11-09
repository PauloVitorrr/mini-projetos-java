package exercicios.AvancandoPOO.Exercicio03;

public class Animal {
    protected String nome;
    protected String som;


    public Animal(String nome, String som){
        this.nome = nome;
        this.som = som;
    }

    public void exibirInfos(){
        System.out.println("Nome do animal: " + nome);
        System.out.println("Som do animal: " + som);
    }
}

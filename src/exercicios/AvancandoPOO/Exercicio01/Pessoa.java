package exercicios.AvancandoPOO.Exercicio01;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;   
    }
    
    public void exibirInformacoes(){
        System.out.println("Dados da pessoa: Nome " + nome + " idade: " + idade);
        endereco.exibirInfo();   
    }
}

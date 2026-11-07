package exercicios.AvancandoPOO.Exercicio01;

public class POO {
    
  public static void main(String[] args) {
    Endereco endereco1 = new Endereco("Alfeneiros", 225, "Londres");

    Pessoa pessoa1 = new Pessoa("Harry", 11, endereco1);

    pessoa1.exibirInformacoes();
  }
}

package exercicios.AvancandoPOO.Exercicio04;

abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome){
        this.nome = nome;
    }
    
    public abstract void calcularSalario();
}

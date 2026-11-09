package exercicios.AvancandoPOO.Exercicio04;

public class FuncionarioMeioPeriodo extends Funcionario implements Beneficios{
    public FuncionarioMeioPeriodo(String nome){
        super(nome);
    }

    @Override 
    public void exibirBeneficios(String beneficios){
        System.out.println("Beneficio do funcionario tempo integral " + beneficios);
    }

    @Override 
    public void calcularSalario(){
        System.out.println("Calculando sario meio periodo");
    }
}

package exercicios.AvancandoPOO.Exercicio04;

public class FuncionarioTempoIntegral extends Funcionario implements Beneficios {
    public FuncionarioTempoIntegral(String nome){
        super(nome);
    }

    @Override 
    public void exibirBeneficios(String beneficios){
        System.out.println("Beneficio do funcionario tempo integral " + beneficios);
    }

    @Override 
    public void calcularSalario(){
        System.out.println("Calculando salario tempo integral");
    }

}

package exercicios.AvancandoPOO.Exercicio04;

public class POO {
    public static void main(String[] args) {
        FuncionarioTempoIntegral funcionario1 = new FuncionarioTempoIntegral("Alberto");
        funcionario1.calcularSalario();
        funcionario1.exibirBeneficios("Vale alimentação");

        FuncionarioMeioPeriodo funcionario2 = new FuncionarioMeioPeriodo("Junior");
        funcionario2.calcularSalario();
        funcionario2.exibirBeneficios("Vale refeição");
    }
}

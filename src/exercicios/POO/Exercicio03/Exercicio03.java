package exercicios.POO.Exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Mimi", 399.0, 500);

        conta1.depositar(10);
        conta1.exibirSaldo();
    }
}

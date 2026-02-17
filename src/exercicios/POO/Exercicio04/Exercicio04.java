package exercicios.POO.Exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        ProdutoEletronico microondas = new ProdutoEletronico("Microondas" , 400, 3);

        microondas.aplicarDesconto(4);
        microondas.exibirInfo();
    }
}

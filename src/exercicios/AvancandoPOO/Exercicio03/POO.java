package exercicios.AvancandoPOO.Exercicio03;

public class POO {
    public static void main(String[] args) {
        Animal animal1 = new Animal("TUTU", "Miau");
        Cachorro cachorro1 = new Cachorro("Trovão","Au au", "Pincher");

        animal1.exibirInfos();
        cachorro1.exibirDetalhes();
    }
}

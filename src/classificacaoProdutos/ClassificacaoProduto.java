package secao7_Classificacao;
import java.util.Scanner;


public class ClassificacaoProduto {
    public static void main(String[] args) {
        String produto1 = "Arroz";
        String produto2 = "Feijão";
        String produto3 = "Carne";

        double preco = 0;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Consulte o produto!");
        String produto = scanner.nextLine();

        if(produto1.equalsIgnoreCase(produto) || 
        produto2.equalsIgnoreCase(produto) || 
        produto3.equalsIgnoreCase(produto)
        ){
            System.out.println("Produto já existe. Quer atualizar o preço? (sim/nao)");

            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("sim")){
                System.out.println("Insira o novo preço:");
                preco = scanner.nextDouble();
            } else {
                System.out.println("Preço não atualizado!");
                scanner.close();
            }
        } else {
            System.out.println("Insira o preço do produto!");
            preco = scanner.nextDouble();
        }

        //classificação do preço
        if(preco < 50 ){
            System.out.println("Classificação barato!");
        } 

        if(preco >= 50 && preco <= 100){
            System.out.println("Classificação: moderado!");
        } else {
            System.out.println("Classificação: caro");
        }

        System.out.println("Produto: " + produto + ". Preço" + preco);

        scanner.close();
    }
}

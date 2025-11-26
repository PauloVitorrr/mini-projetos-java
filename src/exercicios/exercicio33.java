package exercicios;


import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da sua compra");

        double valorCompra = scanner.nextDouble();


        if (valorCompra > 100.00){
            valorCompra *= 0.90;
            System.out.println("Voce recebeu um desconto de 10%, valor fina da compra " + valorCompra);
        } else {
            System.out.println("Sem desconto. Valor final: R$ " + valorCompra);
        }

    }
}

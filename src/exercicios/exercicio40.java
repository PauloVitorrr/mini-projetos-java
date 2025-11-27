package exercicios;

import java.util.Scanner;

public class exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a velocidade do veiculo");

        int velocidade = scanner.nextInt();

        if(velocidade <= 60) {
            System.out.println("O veiculo está no limite de velocidade");
        } else if(velocidade >= 61 && velocidade <= 80){
            System.out.println("O veiculo está acima limite de velocidade");
        } else if (velocidade > 80){
            System.out.println("O veiculo está muito acima do limite de velocidade");
        } else {
            System.out.println("Velocidade invalida");
        }
    }
}

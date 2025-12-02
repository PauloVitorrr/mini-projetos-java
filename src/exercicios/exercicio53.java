package exercicios;

import java.util.Scanner;

public class exercicio53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5 ; i++){
            System.out.println("Digite o número " + i + ":");
            int numero = scanner.nextInt();

            soma += numero;
        }

        double media = soma/5.0;

        System.out.println("A media dos numeros são: " + media);
    }
}

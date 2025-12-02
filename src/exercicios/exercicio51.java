package exercicios;

import java.util.Scanner;

public class exercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero fatorial");

        int numero = scanner.nextInt();
        int soma = 1;
        for (int i = 1; i <= numero; i++){
            soma *= i;
        }

        System.out.println("fatorial do numero digitado" + soma);
    }
}

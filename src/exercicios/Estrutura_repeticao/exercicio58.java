package exercicios.Estrutura_repeticao;

import java.util.Scanner;

public class exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de 1 a 10");

        int numero = scanner.nextInt();
        while (numero < 1 || numero > 10){
            System.out.println("Número inválido. Tente novamente");
            System.out.println("Digite um número de 1 e 10: ");
            numero = scanner.nextInt();
        }

    }
}

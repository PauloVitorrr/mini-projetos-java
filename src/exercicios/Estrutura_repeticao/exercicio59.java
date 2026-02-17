package exercicios.Estrutura_repeticao;

import java.util.Scanner;

public class exercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para somar");

        int numero = scanner.nextInt();

        int somaAcumulativa = 0;

        while (numero != 0){
            somaAcumulativa = somaAcumulativa + numero;
            System.out.println("Digite outro numero para somar ");
            numero = scanner.nextInt();
        }

        System.out.println("A soma acumulativa é:" + somaAcumulativa);
    }
}

package exercicios.Estrutura_repeticao;

import java.util.Scanner;

public class exercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        int i = 0;

        while (i * i <= n) {
            i++;
        }

        int anterior = i - 1;

        if ((n - (anterior * anterior)) < ((i * i) - n)) {
            System.out.println("Raiz quadrada aproximada: " + anterior);
        } else {
            System.out.println("Raiz quadrada aproximada: " + i);
        }

        sc.close();

    }
}

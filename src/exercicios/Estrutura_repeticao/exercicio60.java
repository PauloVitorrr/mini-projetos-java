package exercicios.Estrutura_repeticao;

import java.util.Scanner;

public class exercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero positivo para contagem");
        int numero = scanner.nextInt();
        int contador = 0;

        while(numero >= 0){
            contador ++;
            System.out.println("Digite novamente um numero positivo para contagem");
            numero = scanner.nextInt();
        }

        System.out.println("Contador de numeros inteiros " + contador);
    }
}

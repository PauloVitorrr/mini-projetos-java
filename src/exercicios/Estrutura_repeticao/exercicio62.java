package exercicios.Estrutura_repeticao;

import java.util.Scanner;

public class exercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");

        int numero = scanner.nextInt();


        while(numero <= 1000){
           numero = numero * 2;
           System.out.println("Valor da multiplicação é " + numero);
        }

        System.out.println("Valor final aós multiplicação acumulada: " + numero);
    }
}

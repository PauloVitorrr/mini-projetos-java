package exercicios.Estrutura_repeticao;

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("Menu de opções");
            System.out.println("1. somar dois numeros");
            System.out.println("2. subtrair dois números");
            System.out.println("3. multiplicar dois numeros");
            System.out.println("4. dividir dois numeros");
            System.out.println("5. sair");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();
            if(opcao >= 1 && opcao <= 4){
                System.out.println("Digite  o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo numero: ");
                double num2 = scanner.nextDouble();

                switch (opcao){
                    case 1:
                        System.out.println("Resultado: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (num1 * num2));
                        break;
                    case 4:
                        if(num2 != 0 ){
                            System.out.println("Resultado:" + (num1/num2));
                        } else {
                            System.out.println("Error: Divisão por zero não é permitida");
                        }
                        break;
                }
            } else if (opcao != 5){
                System.out.println("Opção inválida. Tente novamente!");
            }
            System.out.println();
        } while (opcao!=5);

        System.out.println("Programa encerrado!");
    }
}

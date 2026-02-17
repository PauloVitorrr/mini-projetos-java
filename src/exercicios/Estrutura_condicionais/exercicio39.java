package exercicios.Estrutura_condicionais;

import java.util.Scanner;

public class exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");

        int idade1 = scanner.nextInt();

        System.out.println("Digite outra idade");

        int idade2 = scanner.nextInt();

        if(idade1 == idade2){
            System.out.println("As idades são iguais");
        } else if(idade1 > idade2){
            System.out.println("A pessoa com a primeira idade é a mais velha");
        } else {
            System.out.println("A pessoa com a segunda idade é a mais velha");
        }
    }
}

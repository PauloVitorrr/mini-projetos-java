package exercicios;

import java.util.Scanner;

public class exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um numero");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro numero");
        int n2 = scanner.nextInt();

        System.out.println("Digite outro numero");
        int n3 = scanner.nextInt();

        if(n1 == n2 && n2 == n3){
            System.out.println("Todos os numeros são iguais");
        } else if (n1 >= n2 && n1 >= n3){
            System.out.println("O maior numero é " + n1);
        } else if (n2>= n1 && n2 >= n3){
            System.out.println("O maior numero é " + n2);
        } else {
            System.out.println("O maior número é " + n3);
        }
    }
}

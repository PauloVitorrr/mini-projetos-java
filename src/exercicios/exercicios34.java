package exercicios;

import java.util.Scanner;

public class exercicios34 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");

        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Voce é de maior!");
        } else if (idade >= 60){
            System.out.println("Voce é idoso");
        } else {
            System.out.println("Voce é de menor");
        }
    }
}

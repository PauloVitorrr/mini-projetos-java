package exercicios;

import java.util.Scanner;

public class exercicios35 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota de (0 a 100)");

        int nota = scanner.nextInt();

        if(nota >= 60){
            System.out.println("Voce está aprovado!");
        } else {
            System.out.println("Voce está reprovado!");
        }
    }
}

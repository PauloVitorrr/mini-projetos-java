package exercicios.Estrutura_condicionais;

import java.util.Scanner;

public class exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota escolar de 0 a 10");

        double nota = scanner.nextInt();

        if(nota < 5){
            System.out.println("Nota insuficiente");
        } else if (nota >= 5 && nota <= 7){
            System.out.println("Suficiente");
        } else if (nota > 7 && nota <=10){
            System.out.println("Boa nota");
        } else {
            System.out.println("Nota invalida");
        }
    }
}

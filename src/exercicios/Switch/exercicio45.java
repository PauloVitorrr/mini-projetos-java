package exercicios.Switch;

import java.util.Scanner;

public class exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 4");
        int estacao = scanner.nextInt();

        switch(estacao){
            case 1:
                System.out.println("Verão");
                break;
            case 2:
                System.out.println("Outono");
                break;
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
                System.out.println("Primaveira");
                break;
            default:
                System.out.println("Número inválido digite de 1 a 4");
                break;
        }
    }
}

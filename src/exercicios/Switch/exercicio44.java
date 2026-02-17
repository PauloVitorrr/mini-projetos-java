package exercicios.Switch;

import java.util.Scanner;

public class exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite outro numero");
        double nota2 = scanner.nextDouble();
        System.out.println("Escolha um operador!");
        System.out.println("Somar  +");
        System.out.println("Subtrair -");
        System.out.println("Multiplicar *");
        System.out.println("Dividir /");
        char operador = scanner.next().charAt(0);

        switch (operador){
            case '+':
                System.out.println("Resultado " + (nota1 + nota2));
                break;
            case '-':
                System.out.println("Resultado " + (nota1 + nota2));
                break;
            case '*':
                System.out.println("Resultado " + (nota1 + nota2));
                break;
            case '/':
                if(nota2 != 0){
                    System.out.println("Resultado " + (nota1 + nota2));
                    break;
                }
            default:
                System.out.println("Operação invalida");
                break;
        }

    }
}

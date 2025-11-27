package calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 numero");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite outro numero");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha um numero para escolher a operação");
        System.out.println("1) Adição");
        System.out.println("2) Subtração");
        System.out.println("3) Multiplicação");
        System.out.println("4) Divisão");
        int operador = scanner.nextInt();

        double resultado = 0;

        switch (operador){
            case 1:
               resultado =  somar(numero1, numero2);
               break;
            case 2:
                resultado = subtrair(numero1, numero2);
                break;
            case 3:
                resultado = multiplicar(numero1, numero2);
                break;
            case 4:
                if(numero2 != 0){
                    System.out.println("Divisão por 0 não é permitida!");
                    resultado = dividir(numero1, numero2);
                } else {
                    scanner.close();
                    return;
                }
                break;


            default:
                System.out.println("Operação inválida");
                break;
        }

        System.out.println(resultado);
        scanner.close();
    }


    public static double somar (double numero1, double numero2){
        return numero1 + numero2;
    }
    public static double subtrair (double numero1, double numero2){
        return numero1 - numero2;
    }
    public static double multiplicar (double numero1, double numero2){
        return numero1 * numero2;
    }
    public static double dividir (double numero1, double numero2){
        return numero1 / numero2;
    }
}

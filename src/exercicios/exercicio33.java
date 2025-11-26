package exercicios;

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite um numero para verificar se ele é positivo ou negativo");

       int numero = scanner.nextInt();

       if(numero > 0){
           System.out.println("Este numero é positivo");
       } else if (numero < 0){
           System.out.println("Este número é negativo");
       } else {
           System.out.println("Este número é neutro");
       }
    }
}

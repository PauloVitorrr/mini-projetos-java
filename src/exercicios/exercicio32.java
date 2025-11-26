package exercicios;

import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ver se ele é impar ou par");

        int numero = scanner.nextInt();

        if(numero % 2 == 0 ){
            System.out.println("Este numero é par");
        } else {
            System.out.println("Este numero é impar");
        }
    }
}

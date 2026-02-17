package exercicios.Switch;

import java.util.Scanner;

public class exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 10 para tabuada");

        int numero = scanner.nextInt();

        for(int i = 0; i <= 10; i++){
            int result = i * numero;
            System.out.println(numero + "*" + i + "=" + result);
        }
    }
}

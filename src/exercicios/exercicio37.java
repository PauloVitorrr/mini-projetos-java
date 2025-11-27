package exercicios;

import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura atual");

        int clima = scanner.nextInt();

        if(clima < 15){
            System.out.println("O clima está frio");
        } else if (clima >= 15 && clima <= 30){
            System.out.println("O clima está agradavél");
        } else if (clima > 30){
            System.out.println("O clima está quente");
        }
    }
}

//Escreva um programa que leia um número inteiro e um número decimal do teclado e, em seguida, exiba a soma desses números no console.
//

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        System.out.println("Digite o número abaixo");
        Scanner scannerData = new Scanner(System.in);
        int n1 = scannerData.nextInt();

        System.out.println("Digite o número decimal abaixo");
        scannerData.useLocale(Locale.US);
        float n2 = scannerData.nextFloat();

        double n3 = n1 + n2;

        System.out.println(n1 + " + " + n2 + " =" + n3);
    }
}

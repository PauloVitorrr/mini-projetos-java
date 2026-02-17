package exercicios.Switch;

import java.util.Scanner;

public class exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreve de sua nota de 0 a 10");
        int nota = scanner.nextInt();

        switch (nota){
            case 10:
                System.out.println("Nota excelente");
                break;
            case 9:
            case 8:
                System.out.println("Nota muito boa");
                break;
            case 7:
            case 6:
                System.out.println("Nota bom");
                break;
            case 5:
                System.out.println("Nota regular");
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Nota insuficiente!");
            default:
                System.out.println("Nota invalida");
        }
    }
}

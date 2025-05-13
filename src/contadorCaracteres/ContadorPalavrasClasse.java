package secao10_Contador;

import java.util.Scanner;

public class ContadorPalavrasClasse {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String continuar = "s";

      while(continuar.equalsIgnoreCase("s")){
        contadorPalavras();

        System.out.println("Deseja continuar? (s/n)" );

        continuar = scanner.nextLine();
      }
      System.out.println("Sistema encerrado");

    }

    public static void contadorPalavras() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase");

        String  frase = scanner.nextLine();
        String[] palavras = frase.trim().split("\\s+");

        int numeroPalavras = palavras.length;

        System.out.println("A frase contém " + numeroPalavras + " palavras");

    }
}
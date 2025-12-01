package jogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //obter  o número aleatorio
        int numeroSecreto = random.nextInt(100) + 1;

        int palpite = 0;
        int tentativas = 0;


        while (palpite != numeroSecreto){
            System.out.println("Digite seu palpite: ");
            palpite = scanner.nextInt();

            tentativas ++;

            if (palpite < numeroSecreto){
                System.out.println("O palpite é menor do que o numero secreto");
            } else if (palpite > numeroSecreto){
                System.out.println("O palpite é maior do que o numero secreto");
            } else {
                System.out.println("Voce acertou o numero secreto que é: " + numeroSecreto + " Voce conseguiu com esse numero de tentativas " + tentativas + "!");
            }
        }
    }
}

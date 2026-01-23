package jogoForca;

import java.util.Arrays;
import java.util.Scanner;

public class jogoForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavraSecreta = "TOMATE";

        char[] palavraOculta = new char[palavraSecreta.length()];

        int tentativas = 5;
        boolean resultado = false;

        for(int i = 0; i < palavraSecreta.length(); i++){
            palavraOculta[i] = '_';
        }




        while(tentativas != 0){
            System.out.println("Numeros de tentativas restante:" + tentativas);
            System.out.println(Arrays.toString(palavraOculta));
            System.out.println("Digite 1 letra para descobrir a palavra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i++){
                if(palavraSecreta.charAt(i) == letra){
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }

            if(!acertou){
                tentativas --;
                System.out.println("Letra incorreta");
            } else {
                System.out.println("Palavra correta!");
            }

            if(String.valueOf(palavraOculta).equals(palavraSecreta)){
                resultado = true;
                break;
            }


            //condição de vitoria

            if(resultado){
                System.out.println("Parabéns, voce vem em " + tentativas + " tentativas");
                System.out.println("A palavra secreta era: ");
            } else {
                System.out.println("Voce perdeu! ");
            }
        }
    }
}

package loteria;

import java.util.Arrays;
import java.util.Random;

public class Bilhete {
    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos){
        this.numerosEscolhidos = numerosEscolhidos;
    }

    //método para realizar o sorteio
    public void realizarSorteio(){
        Random random = new Random();

        resultadoSorteio = new int[6];

        for(int i = 0; i < resultadoSorteio.length; i++){
             resultadoSorteio[i] = random.nextInt(60) + 1;
        }

        Arrays.sort(resultadoSorteio);

    }

    //método para contar quantos números o jogador acertou

    public int contarAcertos(){
        int acertos = 0;

        for(int numerosEscolhido : numerosEscolhidos){
            for(int numeroSorteado : resultadoSorteio){
                if(numerosEscolhido == numeroSorteado){
                    acertos++;
                }
            }
        }

        return acertos;
    }

    // Exibir os resultados
    public void exibirResultados(){
        System.out.println("Números escolhidos: " + Arrays.toString(numerosEscolhidos));
        System.out.println("Números sorteados: " + Arrays.toString(resultadoSorteio));

        int acertos = contarAcertos();
        
        System.out.println("Voce acertou " + acertos + "Acertos.");
        System.out.println();
    }
    
}

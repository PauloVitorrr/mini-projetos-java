package exercicios.Estrutura_repeticao;

public class exercicio56 {
    public static void main(String[] args) {
        int produto = 1;

        for(int i = 1; i <= 10; i++){
            produto *= i;
        }

        System.out.println("O produto de um número é " + produto);
    }
}

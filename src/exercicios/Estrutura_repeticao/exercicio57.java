package exercicios.Estrutura_repeticao;

public class exercicio57 {
    public static void main(String[] args) {
        int impar = 0;
        int par = 0;

        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                par += i;
            } else {
                impar += i;
            }
        }

        System.out.println("a soma dos impares " + impar);
        System.out.println("a somda dos pares " + par);
    }
}

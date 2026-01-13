package exercicios.array;

public class exercicio02 {
    public static void main(String[] args) {
        //encontre um elemento mais frequente em um array
        int[] arrayNumeros = {10,20,10,30,40,10};
        int maisFrequente = arrayNumeros[0];
        int contador= 1;

        for (int i = 0; i < arrayNumeros.length; i++){
           int contagem = 0;

           for(int j = 0; j < arrayNumeros.length; j++){
               if (arrayNumeros[i] == arrayNumeros[j]){
                   contagem ++;
               }
           }

            System.out.println(contagem + "CONTAGEM");

           if(contagem > contador){
                contador = contagem;
                maisFrequente = arrayNumeros[i];
           }
        }

        System.out.println("O mais frequente é: " + maisFrequente);
    }
}

package exercicios.array;

import java.util.Arrays;

public class exercicio03 {
    public static void main(String[] args) {
        //substituir valores  em um array com condição
        int[] arrayInteiro = {1,-1,2,-3};
        System.out.println(Arrays.toString(arrayInteiro));
        for(int i = 0; i < arrayInteiro.length; i++){


            if(arrayInteiro[i] < 0){
                arrayInteiro[i] = 0;
            }
        }

        System.out.println("Array com apenas numero positivo" + Arrays.toString(arrayInteiro));
    }
}

package exercicios.array;

import java.util.Arrays;

public class exercicio01 {
    public static void main(String[] args) {
        //INVERTA OS ELEMENTOS DO ARRAY
        int[] arrayOriginal = {1,2,3,4,5};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for(int i = 0; i < arrayOriginal.length; i++){
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        System.out.println(Arrays.toString(arrayInvertido));
    }
}

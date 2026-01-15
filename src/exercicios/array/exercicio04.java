package exercicios.array;

import java.util.ArrayList;
import java.util.Arrays;

public class exercicio04 {
    public static void main(String[] args) {
        //remover elementos duplicados de um array
        //[1,2,3,2,1];
        //[1,2,3];

        int[] arrayDuplicadas = {1,2,3,1,2,3};
        ArrayList<Integer> arrayNaoDuplicadas = new ArrayList<>();

        for (int numeros : arrayDuplicadas){
            if(!arrayNaoDuplicadas.contains(numeros)){
                 arrayNaoDuplicadas.add(numeros);
            }
        }

        System.out.println(arrayNaoDuplicadas);
    }
}

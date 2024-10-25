//Desenvolva um programa que exiba o valor de uma variável double com duas casas decimais.
// Utilize formatação para garantir que o valor seja exibido corretamente.

import java.text.DecimalFormat;

public class exercicio10 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#,##0.00");


        double numero = 1200;

        System.out.println(df.format(numero));
    }
}

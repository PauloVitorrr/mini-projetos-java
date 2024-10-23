//Desenvolva um programa que declare duas variaveis int e realize as operações de soma, subtração, multiplicação
// divisão  e módulo entre elas. Exiba os resultados de cada operação

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Digite o primeiro número abaixo: ");
        int n1 = entrada1.nextInt();

        System.out.println("Digite o segundo número abaixo: ");
        Scanner entrada2 = new Scanner(System.in);
        int n2 = entrada2.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        float divisao = n1 / n2;

        System.out.println("A soma dos numéros são: "+n1 + " + " + n2 + " = " + soma);
        System.out.println("A subtração dos números são: " +n1 + "- " + n2 + " = " + subtracao);
        System.out.println("A multiplicação dos números são: " +n1 + "x " + n2 + " = " + multiplicacao);
        System.out.println("A divisão dos números são :"  +n1 + " / " + n2 + " = " + divisao);

    }
}

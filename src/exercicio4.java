//escreva um programa que converta um valor double em int e outro valor int em double.
//exiba os resultados das conversões e explique a diferença entre conversões explícita e implicita.

public class exercicio4 {
    public static void main(String[] args){
        int n1 = 9;
        double n2 = n1;

        // aqui em cima houve uma conversão implicita onde eu concatenei uma váriavel inteira no double onde teve a
        //conversão de váriaveis

        System.out.println(n2 + " meu double");

        double myDouble = 9.78;
        int myInt = (int) myDouble;

        // Já nesse outro caso eu precisei usar em parantese para qual formato eu quero converter

        System.out.println(myInt + " meu inteiro");

    }
}

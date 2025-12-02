package exercicios;

public class exercicio54 {
    public static void main(String[] args) {

        int soma = 0;

        for (int i = 0; i <= 100; i++){

            if (i % 3 == 0){
                soma += 1;
            }
        }
        System.out.println("Esses numeros são é o total de numeros divisiveis por tres " + soma);
    }
}

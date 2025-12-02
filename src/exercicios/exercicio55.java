package exercicios;

public class exercicio55 {
    public static void main(String[] args) {
        int proximoTermo = 0;

        int numero1 = 0;
        int numero2 = 1;

        for (int i = 3; i <= 10; i++){
            proximoTermo = numero1 + numero2;

            System.out.println("O proximo termo é:" + proximoTermo);

            numero1 = numero2;
            numero2 = proximoTermo;
        }
    }
}

package exercicios.Estrutura_repeticao;

import java.util.Scanner;

public class exercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "teste";
        String senha;

        do{
            System.out.println("Digite a senha correta");
            senha = scanner.nextLine();

            if(!senha.equals(senhaCorreta)){
                System.out.println("Senha incorreta digite novamente");
            }
        } while(!senha.equals(senhaCorreta));

        System.out.println("Parabéns vc acertou a senha correta!");
    }
}

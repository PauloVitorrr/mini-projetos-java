//Crie um programa que peça ao usuário para digitar seu nome e sobrenome. O programa deve exibir uma mensagem de
// boas-vindas concatenando o nome e o sobrenome do usuário.


import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args){
        System.out.println("Digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Seja bem-vindo " + nome + " " + sobrenome);
    }
}

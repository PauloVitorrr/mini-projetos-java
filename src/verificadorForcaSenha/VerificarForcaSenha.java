package verificadorForcaSenha;

import java.util.Scanner;

public class VerificarForcaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        int forca = verificadorForcaSenha(senha);

        if(forca <= 2){
            System.out.println("A senha é fraca");
        } else if (forca == 3){
            System.out.println("A senha é média.");
        } else if (forca == 4){
            System.out.println("A senha é segura!");
        } else {
            System.out.println("A senha é muito forte");
        }

        scanner.close();
    }

    public static int verificadorForcaSenha(String senha){

        int forca = 0;

        if(senha.length() > 8){
            forca ++;
        }

        if(senha.matches(".*[A-Z].*")){
            forca ++;
        }

        if(senha.matches(".*[a-z].*")){
            forca ++;
        }

        if(senha.matches(".*\\d.*")){
            forca ++;
        }

        return forca;
    }
}

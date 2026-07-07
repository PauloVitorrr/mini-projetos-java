package gerenciarMotos;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorMotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        ArrayList<Moto> frota = new ArrayList<>();

       

        do{
            System.out.println("Digite uma das opções");
            System.out.println("1. Cadastrar moto");
            System.out.println("2. Listar todas as Motos");
            System.out.println("3. Registrar abastecimento");
            System.out.println("4. Realizar revisão em uma moto");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();

             switch (opcao) {
                case 1:
                    System.out.println("Cadastrando moto");
                    scanner.nextLine();
                    System.out.println("Digite o modelo:");
                    String modelo = scanner.nextLine();
                    System.out.println("Digite a quilometragem: ");
                    double quilometragem = scanner.nextDouble();
                    Moto cadastroMoto = new Moto(modelo, quilometragem);
                    System.out.println("Moto cadastrada com sucesso");
                    frota.add(cadastroMoto);
                    break;
                 case 2:
                    System.out.println("Listando motos");
                    for(Moto moto : frota){
                        moto.getMotoCadastrada();
                    }
                    break;
                default:
                    break;
            }
        } while(opcao != 5);
    }
}

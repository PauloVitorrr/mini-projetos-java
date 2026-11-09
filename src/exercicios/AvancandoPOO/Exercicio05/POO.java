package exercicios.AvancandoPOO.Exercicio05;

public class POO {
    public static void main(String[] args) {
        Pilotavel meuHidroAviao = new HidroAviao();
        Navegavel meuBarco = new Barco();
        Pilotavel meuAviao = new Aviao();

        meuAviao.pilotar();
        meuHidroAviao.pilotar();
        meuBarco.navegar();

        operarVeiculo(meuAviao);
        operarVeiculo(meuBarco);
    }

    public  static void operarVeiculo(Object veiculo){
        if(veiculo instanceof Pilotavel){
            System.out.println("Este veiculo é pilotável");
        }
        if(veiculo instanceof Navegavel){
            System.out.println("Este veiculo é navegável");
        }
    }
}

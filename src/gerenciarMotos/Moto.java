package gerenciarMotos;

public class Moto {
    private String modelo;
    private double quilometragemAtual;
    private double totalLitrosAbastecidos;
    private double totalkmRodados;


    //construtor
    public  Moto(String modelo, double quilometragemAtual){
        this.modelo = modelo;
        this.quilometragemAtual = quilometragemAtual;
    }

    public void getMotoCadastrada(){
        System.out.println("Modelo da moto cadastrada: " + modelo);
        System.out.println("Quilometragem da moto: " + quilometragemAtual);
    }
}

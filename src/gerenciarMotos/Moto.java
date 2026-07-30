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
        System.out.println("=====================");
        System.out.println("Modelo da moto cadastrada: " + modelo);
        System.out.println("Quilometragem da moto: " + quilometragemAtual);
        if(totalLitrosAbastecidos > 0 && totalkmRodados > 0){
            System.out.println("Total de litros abastecidos" + totalLitrosAbastecidos);
            System.out.println("Total de km rodados" + totalkmRodados);
        }
    }

    public String getModelo(){
        return modelo;
    }

    public void abastecer(double litros, double kmRodados){
        this.totalLitrosAbastecidos += litros;
        this.totalkmRodados += kmRodados;
        this.quilometragemAtual += kmRodados;
        System.out.println("Estou abastecendo " + litros + " Litros");
        System.out.println("Finalizando o abastecimento");
        System.out.println("O consumo médio é: " + calcularConsumoMedio());
    }

    public double calcularConsumoMedio(){
        if (this.totalLitrosAbastecidos == 0){
            return 0;
        }

        return this.totalkmRodados / this.totalLitrosAbastecidos;
    }
}

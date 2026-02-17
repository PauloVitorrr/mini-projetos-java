package exercicios.POO.Exercicio03;

public class ContaCorrente {
    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(String titular, double saldo, double limiteSaque){
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    void depositar(double deposito){
        if(deposito > 0){
            this.saldo += deposito;
        } else{
            System.out.println("esse valor não pode ser depositado");
        }
    }

    void sacar (double valor){
        if(valor <= saldo && valor <= limiteSaque){
            saldo -= valor;
            System.out.println("Saque de: " + valor + ", o saldo agora é: " + saldo);
        } else {
            System.out.println("Saque inválido");
        }
    }

    void exibirSaldo(){
        System.out.println("Titular: " + titular + ". Tem na conta o total de : " + saldo);
    }
}

package exercicios.POO.Exercicio04;

public class ProdutoEletronico {

    private String nome;
    private double preco;
    private int garantia; // em meses

    public ProdutoEletronico(String nome, double preco, int garantia){
        this.nome = nome;
        this.preco = preco;
        this.garantia = garantia;
    }

    public String getNome(){
        return nome.toUpperCase();
    }

    public String getPreco(){
        return  String.format("R$%.2f", preco);
    }

    public void setPreco(double preco){
        if(preco > 0){
            this.preco = preco;
        } else {
            System.out.println("O preço do produto não pode ser negativo ou zero");
        }
    }

    public String getProdutoInfo(){
        return "Nome: " + this.getNome() + ", Preço: " + this.getPreco();
    }


    public void aplicarDesconto(int porcetagem){
        if(porcetagem > 0 && porcetagem <= 100){
            double desconto = calcularDesconto(porcetagem);
            double precoFinal = this.preco - desconto;

            this.setPreco(precoFinal);

            System.out.println("Desconto de " + porcetagem + "% aplicado!");

            System.out.println(this.getProdutoInfo());
        }
    }

    private double calcularDesconto(double porcetagem){
        return (this.preco * porcetagem) / 100;
    }

    public void exibirInfo(){
        System.out.println("O produto: " + nome + ", está com o preço de: " + preco + ", e tem " + garantia + " meses de garantia");
    }
}

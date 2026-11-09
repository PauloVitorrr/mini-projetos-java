package exercicios.AvancandoPOO.Exercicio05;

public class HidroAviao extends Barco implements Pilotavel{
    @Override 
    public void pilotar(){
        System.out.println("O hidroavião está voando e depois vai navegar");
    }
}

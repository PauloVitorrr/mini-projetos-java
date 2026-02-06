package exercicios.POO.Exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Celular iphone = new Celular();

        iphone.marca = "Apple";
        iphone.modelo = "Iphone 15";

        iphone.ligarCelular();
        iphone.desligar();
        iphone.usar(10);

        Celular s10 = new Celular();

        s10.marca = "Samsung";
        s10.modelo = "s10";

        s10.usar(15);

    }
}

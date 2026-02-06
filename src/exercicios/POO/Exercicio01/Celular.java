package exercicios.POO.Exercicio01;

public class Celular {

     String marca;
     String modelo;
     int bateria = 100;



    void ligarCelular(){
        System.out.println("O celular " + modelo + " está ligando.");
    }

    void desligar(){
        System.out.println("O celular " + modelo + " está desligando");
    }

    void usar(int consumo){
        if(bateria - consumo >= 0){
            bateria -= consumo;
            System.out.println("O celular foi usado. A bateria está em" + bateria + "%");
        } else {
            System.out.println("Bateria é insuficiente");
        }
    }
}

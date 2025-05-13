package secao9_Conversao;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversor {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Se voce quer converter a temperatura para: Celsius para fahrenheit: Digite 1. De fahrenheit para celsius digite 2.");
        int  conversao = scanner.nextInt();

        if(conversao == 1){
            System.out.println("Digite a temperatura em celsius");
            double temperatura = scanner.nextDouble();
            celsiusFahrenheit(temperatura);
        }

        if(conversao == 2){
            System.out.println("Digite a temperatura em fahrenheit");
            double temperatura = scanner.nextDouble();
            fahrenheitCelsius(temperatura);
        }
    }
    
     
    public static void celsiusFahrenheit(double temperatura){
        double temperaturaConvertida = (temperatura *  1.8) + 32; 

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#,##0.00");

        System.out.println("De " + temperatura + " C " + " para " + df.format(temperaturaConvertida) + " °F " );
    }

    public static void fahrenheitCelsius(double temperatura){
        double temperaturaConvertida =   (temperatura - 32) * (5.0 / 9.0);

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("#,##0.00");

        System.out.println("De " + temperatura + " °F " + " para " + df.format(temperaturaConvertida) + " °C");
    }
    
}
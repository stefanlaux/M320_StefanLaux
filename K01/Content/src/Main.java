import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int bitcoinPrice = 15500;
        int assets = 14000;
        String currencyName = "Bitcoin";
        Scanner sc = new Scanner(System.in);
        Scanner statusSc = new Scanner(System.in);
        String input;
        String status = "n";
        Main main = new Main();


        while(status.equals("n")){

            main.printTUI(currencyName, bitcoinPrice, assets);

            input = sc.next();

            if (input.equals("verkaufen")){
                System.out.println("Sie haben einen Bitcoin verkauft im Wert von: " + bitcoinPrice);
                assets = assets + bitcoinPrice;
            }else if (input.equals("kaufen")){
                if (bitcoinPrice - assets > 0){
                    System.out.println("Sie haben zu wenig Geld!");
                    break;
                }else{
                    System.out.println("Sie haben einen Bitcoin verkauft im Wert von: " + bitcoinPrice);
                    assets = assets - bitcoinPrice;
                }
            }else{
                System.out.println("Fehlermeldung! Flasche Eingabe!");
            }
            System.out.print("Wollen Sie aufhören? (y/n): ");
            status = statusSc.next();
        }



    }

    public void printTUI(String currencyName, int bitcoinPrice, int assets){
        System.out.println("Welcome to the " + currencyName + " Trader!");
        System.out.println("------------------------------");
        System.out.println("Current Price: " + bitcoinPrice);
        System.out.println("Current assets: " + assets);
        System.out.println("------------------------------");
        System.out.print("Wollen sie Bitcoin (kaufen) oder (verkaufen): ");
    }
}
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);


    Bitcoin bitcoin = new Bitcoin(15000);
    public void start(){
        userInterface();
        int input = sc.nextInt();
        if (input == 1){
            System.out.println(bitcoin);
        } else if (input == 2) {
            System.out.println("Welchen Preis wollen Sie setzten?");
            System.out.print("Preis: ");
            input = sc.nextInt();
            bitcoin.setBitcoinPrice(input);
            System.out.println("Price set to " + bitcoin.getBitcoinPrice() + " CHF");
        }else {
            System.out.println("Falsche Eingabe!");
        }
    }


    public void userInterface(){
        System.out.println("Was wollen Sie tun?" +
                "\n(1) Bitcoinpreis abfragen" +
                "\n(2) Bitcoinpreis setzen");
        System.out.print("Eingabe: ");
    }

}

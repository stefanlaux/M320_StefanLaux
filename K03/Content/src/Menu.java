import java.util.Scanner;

public class Menu {
    Bitcoin bitcoin = new Bitcoin(15000);
    public void start() throws TooFewMoneyException {
        userInterface();
        int input = getIntInput();
        if (input == 1){
            System.out.println(bitcoin);
        } else if (input == 2) {
            System.out.println("Welchen Preis wollen Sie setzten?");
            System.out.print("Preis: ");
            input = getIntInput();
            bitcoin.setBitcoinPrice(input);
            System.out.println("Price set to " + bitcoin.getBitcoinPrice() + " CHF");
        } else if (input == 3) {
            System.out.println("Wie viel Geld haben sie?");
            System.out.print("Geld: ");
            input = getIntInput();
            bitcoin.buyBitcoin(input);
        }
    }


    public void userInterface(){
        System.out.println("Was wollen Sie tun?" +
                "\n(1) Bitcoinpreis abfragen" +
                "\n(2) Bitcoinpreis setzen" +
                "\n(3) Bitcoin kaufen");
        System.out.print("Eingabe: ");
    }

    public int getIntInput() {
        while(true){
           try{
               Scanner scanner = new Scanner(System.in);
               return scanner.nextInt();
           }catch (Exception e){
               System.out.print("Falsche Eingabe! \nNeuer Versuch: ");
           }
        }
    }

}

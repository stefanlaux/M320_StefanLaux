// Import library
import java.util.Scanner; // Scanner Library to scan for input

/**
 * Menu class
 */
public class Menu {

    // Creates a new Bitcoin Object
    Bitcoin bitcoin = new Bitcoin(15000);

    /**
     * Method to start the menu
     * @throws TooFewMoneyException
     */
    public void start() throws TooFewMoneyException {
        userInterface(); //displays the user interface
        int input = getIntInput();
        if (input == 1){ // If the user input is 1
            System.out.println(bitcoin); // Print the bitcoin price
        } else if (input == 2) { // If the user input is 2
            System.out.println("Welchen Preis wollen Sie setzten?");
            System.out.print("Preis: ");
            input = getIntInput();
            bitcoin.setBitcoinPrice(input); // Set the bitcoin price
            System.out.println("Price set to " + bitcoin.getBitcoinPrice() + " CHF");
        } else if (input == 3) { // If the user input is 3
            System.out.println("Wie viel Geld haben sie?");
            System.out.print("Geld: ");
            input = getIntInput();
            bitcoin.buyBitcoin(input); // Buy bitcoin
        }
    }

    /**
     * Method to display the user interface
     */
    public void userInterface(){
        System.out.println("Was wollen Sie tun?" +
                "\n(1) Bitcoinpreis abfragen" +
                "\n(2) Bitcoinpreis setzen" +
                "\n(3) Bitcoin kaufen"); // Print the user interface
        System.out.print("Eingabe: ");
    }

    /**
     * Method to get the user input
     * @return input
     */
    public int getIntInput() {
        while(true){ // Infinite loop
           try{ // Try to get the input
               Scanner scanner = new Scanner(System.in); // Create a new Scanner Object
               return scanner.nextInt();
           }catch (Exception e){ // Catch the exception @Exception e
               System.out.print("Falsche Eingabe! \nNeuer Versuch: ");
           }
        }
    }

}

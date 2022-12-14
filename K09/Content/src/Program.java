/**
 * @author Stefan Laux
 * @version 1.0
 * @since 2022
 */
public class Program {
    /**
     * Main method
     * @param args
     * @throws TooFewMoneyException
     */
    public static void main(String[] args) throws TooFewMoneyException {
        Menu menu = new Menu(); // Creates a new Menu Object
        while(true){ // Infinite loop
            try {
                menu.start(); // Starts the menu
            }catch(TooFewMoneyException e){ // Catch the exception @Exception tooFewMoneyException
                System.out.println(e); // Print the exception
            }
        }


    }
}
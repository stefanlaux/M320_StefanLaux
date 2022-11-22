public class Program {
    /*
    *  Main Method to start the program
    *  @param args
    *  @throws TooFewMoneyException
    *  @author Stefan Laux
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
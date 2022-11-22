public class TooFewMoneyException extends Exception{

    // Constructor to create a new TooFewMoneyException Object
    public TooFewMoneyException() {
        super("Sie haben zu wenig Geld!"); // Call the constructor of the super class
    }
}

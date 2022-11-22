public class TooFewMoneyException extends Exception{
    public TooFewMoneyException() {
        super("Sie haben zu wenig Geld!");
    }
}

/**
 * Class Bitcoin to create a Bitcoin Object
 */
public class Bitcoin {
    private int bitcoinPrice; // Bitcoin Price
    private static String abbreviation = "BTC"; // Bitcoin Abbreviation


    /**
     * Method to create a new Bitcoin Object
     * @param money Money
     * @throws TooFewMoneyException IfUserHasTooFewMoney
     */
    public void buyBitcoin(int money) throws TooFewMoneyException {
        if (money - getBitcoinPrice() < 0){
            throw new TooFewMoneyException(); // Throw @Exception TooFewMoneyException
        }else{
            System.out.println("Sie haben einen Bitcoin gekauft!");
        }
    }

    /**
     * Constructor to set the bitcoin price
     * @param bitcoinPrice Bitcoin Price
     */
    public Bitcoin(int bitcoinPrice) {
        this.bitcoinPrice = bitcoinPrice;
    }

    /**
     * Method to get the bitcoin price
     * @return Bitcoin to String
     */
    @Override
    public String toString(){
        return "Current Bitcoin Price is: " + this.bitcoinPrice;
    }


    public int getBitcoinPrice() {
        return bitcoinPrice;
    }

    /**
     *  Method to set the bitcoin price
     * @param bitcoinPrice Bitcoin Price
     */
    public void setBitcoinPrice(int bitcoinPrice) {
        this.bitcoinPrice = bitcoinPrice;
    }



}

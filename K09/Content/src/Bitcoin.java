// Class
public class Bitcoin {
    private int bitcoinPrice; // Bitcoin Price
    private static String abbreviation = "BTC"; // Bitcoin Abbreviation


    // Method to buy bitcoin
    public void buyBitcoin(int money) throws TooFewMoneyException {
        if (money - getBitcoinPrice() < 0){
            throw new TooFewMoneyException(); // Throw @Exception TooFewMoneyException
        }else{
            System.out.println("Sie haben einen Bitcoin gekauft!");
        }
    }

    // Constructor to create a new Bitcoin Object @param bitcoinPrice
    public Bitcoin(int bitcoinPrice) {
        this.bitcoinPrice = bitcoinPrice;
    }

    // Override the toString method to display the bitcoin price
    @Override
    public String toString(){
        return "Current Bitcoin Price is: " + this.bitcoinPrice;
    }

    // Getter for the bitcoin price
    public int getBitcoinPrice() {
        return bitcoinPrice;
    }

    // Setter for the bitcoin price
    public void setBitcoinPrice(int bitcoinPrice) {
        this.bitcoinPrice = bitcoinPrice;
    }



}

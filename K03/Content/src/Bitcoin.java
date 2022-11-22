public class Bitcoin {
    private int bitcoinPrice;
    private final String abbreviation = "BTC";


    public void buyBitcoin(int money) throws TooFewMoneyException {
        if (money - getBitcoinPrice() < 0){
            throw new TooFewMoneyException();
        }else{
            System.out.println("Sie haben einen Bitcoin gekauft!");
        }
    }

    public Bitcoin(int bitcoinPrice) {
        this.bitcoinPrice = bitcoinPrice;
    }


    @Override
    public String toString(){
        return "Current Bitcoin Price is: " + this.bitcoinPrice;
    }

    public int getBitcoinPrice() {
        return bitcoinPrice;
    }

    public void setBitcoinPrice(int bitcoinPrice) {
        this.bitcoinPrice = bitcoinPrice;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

}

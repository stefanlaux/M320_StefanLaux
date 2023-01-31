public class Kurs {

    private int currentPrice;
    private int lastPrice;


    public Kurs(int currentPrice, int lastPrice) {
        this.currentPrice = currentPrice;
        this.lastPrice = lastPrice;
    }

    public int getPriceDifference() {
        return currentPrice - lastPrice;
    }

}

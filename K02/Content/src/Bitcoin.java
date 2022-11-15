public class Bitcoin {
    private final int bitcoinPrice = 15500;
    private String abbreviation;

    public Bitcoin(String abbreviation) {
        this.abbreviation = abbreviation;
    }






    public int getBitcoinPrice() {
        return bitcoinPrice;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}

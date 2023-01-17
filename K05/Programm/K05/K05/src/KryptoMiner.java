public class KryptoMiner extends Computer{

    private int hashRate;

    public KryptoMiner(String GPU, String CPU, int hashRate) {
        super(GPU, CPU);
        this.hashRate = hashRate;
    }

    public int getHashRate() {
        return hashRate;
    }

}

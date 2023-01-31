public class Bitcoin implements Coin{
    private KryptoMiner[] miner;
    private Kurs kurs;
    private Netzwerk netzwerk;
    private Börse börse;

    private int blockNum;


    public Bitcoin(KryptoMiner[] miner, Börse börse) {
        this.miner = miner;
        this.kurs = new Kurs( 200, 100);
        this.netzwerk = new Netzwerk(this.miner, 10, 100);
        this.börse = börse;
    }

    public Bitcoin(int blockNum){
        this.blockNum = blockNum;
        this.börse = new Börse(new String[]{"Bitcoin", "Ethereum", "Litecoin"});
        this.miner = new KryptoMiner[]{new KryptoMiner("Nvidia", "Intel", 1000)};
        this.kurs = new Kurs( 200, 100);
        this.netzwerk = new Netzwerk(this.miner, 10, 100);
    }

    @Override
    public int getBlockNumber() {
        return this.blockNum;
    }

    @Override
    public int setBlock() {
        return this.blockNum++;
    }


    public Kurs getKurs() {
        return kurs;
    }

    public Netzwerk getNetzwerk() {
        return netzwerk;
    }
}

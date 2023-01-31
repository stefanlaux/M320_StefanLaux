public class Netzwerk {

    private KryptoMiner[] miners;
    private int timeToMine;
    private int difficulty;

    public Netzwerk(KryptoMiner[] miners, int timeToMine, int difficulty) {
        this.miners = miners;
        this.timeToMine = timeToMine;
        this.difficulty = difficulty;
    }

    public int getHashRate() {
        return miners.length * timeToMine * difficulty;
    }

}

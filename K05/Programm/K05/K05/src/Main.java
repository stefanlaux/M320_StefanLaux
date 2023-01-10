public class Main {
    public static void main(String[] args) {
    KryptoMiner miner = new KryptoMiner("Nvidia", "Intel", 1000);
    Börse börse = new Börse(new String[]{"Bitcoin", "Ethereum", "Litecoin"});

    Bitcoin bitcoin = new Bitcoin(new KryptoMiner[]{miner}, börse);

        System.out.println(bitcoin.getBlockNumber());
        System.out.println(bitcoin.setBlock());
        System.out.println(bitcoin.getNetzwerk().getHashRate());
        System.out.println(bitcoin.getKurs().getPriceDifference());


    }
}
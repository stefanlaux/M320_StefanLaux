import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    KryptoMiner miner = new KryptoMiner("Nvidia", "Intel", 1000);
    Börse börse = new Börse(new String[]{"Bitcoin", "Ethereum", "Litecoin"});

    Bitcoin bitcoin = new Bitcoin(new KryptoMiner[]{miner}, börse);

        System.out.println(bitcoin.getBlockNumber());
        System.out.println(bitcoin.setBlock());
        System.out.println(bitcoin.getNetzwerk().getHashRate());
        System.out.println(bitcoin.getKurs().getPriceDifference());
        System.out.println(miner.getHashRate());

        //K07
        ArrayList<Bitcoin> bitcoinList = new ArrayList<Bitcoin>();
        for (int i = 1; i < 10; i++) {
            bitcoinList.add(new Bitcoin((int) (Math.random() * 100)));
        }

        //System.out.println("---------------before sort a--------------");
        //for (Bitcoin bitcoin1 : bitcoinList) {
        //    System.out.println(bitcoin1.getBlockNumber());
        //}

        //System.out.println("---------------after sort a--------------");

        //selectionSort(bitcoinList);
        //for (Bitcoin bitcoin1 : bitcoinList) {
        //    System.out.println(bitcoin1.getBlockNumber());
        //}

        System.out.println("---------------before sort b--------------");
        for (Bitcoin bitcoin1 : bitcoinList) {
            System.out.println(bitcoin1.getBlockNumber());
        }

        System.out.println("---------------after sort b--------------");
        collectionsSort(bitcoinList);
        for (Bitcoin bitcoin1 : bitcoinList) {
            System.out.println(bitcoin1.getBlockNumber());
        }
    }


    public static void selectionSort(ArrayList<Bitcoin> bitcoinList) {

        for (int i = 0; i < bitcoinList.size(); i++) {
            int min = i;
            for (int j = i + 1; j < bitcoinList.size(); j++) {
                if (bitcoinList.get(j).getBlockNumber() < bitcoinList.get(min).getBlockNumber()) {
                    min = j;
                }
            }
            Bitcoin temp = bitcoinList.get(i);
            bitcoinList.set(i, bitcoinList.get(min));
            bitcoinList.set(min, temp);
        }


    }

    public static void collectionsSort(ArrayList<Bitcoin> bitcoinList){
        Collections.sort(bitcoinList);
    }

}
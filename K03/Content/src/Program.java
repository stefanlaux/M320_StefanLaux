public class Program {
    public static void main(String[] args) throws TooFewMoneyException {
        Menu menu = new Menu();
        while(true){
            try {
                menu.start();
            }catch(TooFewMoneyException e){
                System.out.println(e);
            }
        }


    }
}
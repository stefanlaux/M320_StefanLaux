public class Tippspiel {

    private Tipp tipp;
    private Game game;
    private Money money;
    private Calculator calculator;

    public Tippspiel( Tipp tipp, Game game, Money money, Calculator calculator ) {
        tipp = new Tipp();
        game = this.game;
        money = this.money;
        calculator = new Calculator();
    }


}

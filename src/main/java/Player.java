public class Player {

    private String name;
    Hand hand;

    public Player(String name, Hand hand){
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }
}

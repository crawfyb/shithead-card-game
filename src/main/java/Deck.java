import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    
    public Deck() {
        cards = new ArrayList<Card>();
        generateDeck();
        shuffle();

    }

    public int cardCount() {
        return cards.size();
    }

    public void generateDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);    }

        public Card getCard() {
        return cards.remove(0);
        }
}

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void deckStartsWith52Cards() {
        assertEquals(52, this.deck.cardCount());
    }

    @Test
    public void deckIsShuffled() {
        Deck deck2 = new Deck();
        assertFalse(deck.equals(deck2));
    }

    @Test
    public void canGetCard() {
        Card card = deck.getCard();
        assertNotNull(card);
    }
}
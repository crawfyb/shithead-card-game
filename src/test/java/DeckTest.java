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

}
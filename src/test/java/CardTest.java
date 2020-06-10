import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    Card card;

    @BeforeEach
    public void setUp() {
        card = new Card(Suit.SPADES, Rank.ACE);
    }

    @Test
    public void cardHasRank() {
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void CardHasSuit() {
        assertEquals(Suit.SPADES, card.getSuit());
    }

    @Test
    public void CardHasValue() {
        assertEquals(14, card.getValue());
    }

}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    Player player;
    Hand hand;

    @BeforeEach
    public void setUp() {
        player = new Player("player1", hand);
    }

    @Test
    public void playerHasName() {
        assertEquals("player1", player.getName());
    }


}
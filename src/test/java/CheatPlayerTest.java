import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CheatPlayerTest {

    @Test
    public void shouldReturnCheatForInput() {
        CheatPlayer cheatPlayer = new CheatPlayer();
        assertEquals(Input.CHEAT, cheatPlayer.getInput());
    }


    @Test
    public void shouldReturnCheatForInput2() {
        CheatPlayer cheatPlayer = new CheatPlayer();
        assertNotEquals(Input.COOPERATE, cheatPlayer.getInput());
    }
}

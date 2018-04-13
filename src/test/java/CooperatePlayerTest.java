import org.junit.Test;

import static org.junit.Assert.*;

public class CooperatePlayerTest {

    @Test
    public void shouldReturnCooperateForAnyCooperatePlayer() {
        CooperatePlayer cooperatePlayer = new CooperatePlayer();
        assertEquals(Input.COOPERATE, cooperatePlayer.getInput());
    }

    @Test
    public void shouldReturnCooperateForAnyCooperatePlayer2() {
        CooperatePlayer cooperatePlayer = new CooperatePlayer();
        assertNotEquals(Input.CHEAT, cooperatePlayer.getInput());
    }

}
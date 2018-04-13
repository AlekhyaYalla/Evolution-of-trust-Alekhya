import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class NormalPlayerTest {

    @Test
    public void shouldReturnInputFromConsoleForNormalPlayer() throws IOException {
        NormalPlayer normalPlayer = new NormalPlayer();
        System.setIn(new ByteArrayInputStream("cooperate".getBytes()));
        assertEquals(Input.COOPERATE, normalPlayer.getInput());
    }

}
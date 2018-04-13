import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class CopyCatPlayerTest {

    @Test
    public void shouldGiveCOOPERATEForFirstInput(){
        CopyCatPlayer copyCatPlayer  = new CopyCatPlayer();

        assertEquals(Input.COOPERATE,copyCatPlayer.getInput());
    }

    @Test
    public void shouldGivePreviousInput() throws IOException {
        CopyCatPlayer copyCatPlayer  = new CopyCatPlayer();
        NormalPlayer normalPlayer = new NormalPlayer();

        System.setIn(new ByteArrayInputStream("cooperate".getBytes()));

        normalPlayer.getInput();
        copyCatPlayer.savePreviousInput(normalPlayer);

        assertEquals(Input.COOPERATE,copyCatPlayer.getInput());
    }
}
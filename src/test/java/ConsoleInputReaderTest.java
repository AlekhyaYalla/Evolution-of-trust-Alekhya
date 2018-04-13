import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class ConsoleInputReaderTest {

    @Test
    public void shouldReturnCorrectInputPairForTextInput() throws IOException {
        System.setIn(new ByteArrayInputStream("cheat,cooperate".getBytes()));
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        assertEquals(Input.CHEAT, consoleInputReader.read().firstInput);
    }

    @Test
    public void shouldReturnCorrectInputStringForTextInput() throws IOException {
        System.setIn(new ByteArrayInputStream("cheat,cooperate".getBytes()));
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        InputPair inputPair = new InputPair(Input.CHEAT, Input.COOPERATE);
        assertEquals(inputPair.secondInput, consoleInputReader.read().secondInput);
    }
}

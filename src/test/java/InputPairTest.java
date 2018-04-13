import org.junit.Test;

import static org.junit.Assert.*;

public class InputPairTest {

    @Test
    public void shouldReturnCHEATInputForString() {
        InputPair inputPair = new InputPair("cheat", "cooperate");
        assertEquals(Input.CHEAT, inputPair.firstInput);
    }

    @Test
    public void shouldReturnCOOPERATEInputForString() {
        InputPair inputPair = new InputPair("cheat", "cooperate");
        assertEquals(Input.COOPERATE, inputPair.secondInput);
    }

}
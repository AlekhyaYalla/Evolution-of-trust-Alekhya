import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class GameTest {

    @Test
    public void playShouldReturnOutputFor25() throws IOException {
        NormalPlayer firstPlayer = new NormalPlayer();
        NormalPlayer secondPlayer = new NormalPlayer();
        Game game = new Game(new OutputPair(0, 0), 1, firstPlayer, secondPlayer);

        System.setIn(new ByteArrayInputStream("cooperate,cooperate".getBytes()));

        assertEquals(2, game.play().player1Points);

        System.setIn(new ByteArrayInputStream("cooperate,cheat".getBytes()));

        assertEquals(5, game.play().player2Points);

    }


    @Test
    public void playShouldReturnOutputForCHEAT_COOPERATE() throws IOException {
        NormalPlayer firstPlayer = new NormalPlayer();
        NormalPlayer secondPlayer = new NormalPlayer();
        Game game = new Game(new OutputPair(4, 5), 1, firstPlayer, secondPlayer);
        System.setIn(new ByteArrayInputStream("cheat,cooperate".getBytes()));

        OutputPair outputPair = game.play();

        assertEquals(7, outputPair.player1Points);
        assertEquals(4, outputPair.player2Points);

    }

    @Test
    public void playWithCheatPlayer() throws IOException {
        NormalPlayer firstPlayer = new NormalPlayer();
        CheatPlayer secondPlayer = new CheatPlayer();
        Game game = new Game(new OutputPair(0, 0), 1, firstPlayer, secondPlayer);
        System.setIn(new ByteArrayInputStream("cooperate".getBytes()));

        OutputPair outputPair = game.play();

        assertEquals(-1, outputPair.player1Points);

    }


    @Test
    public void playWithCooperatePlayer() throws IOException {
        NormalPlayer firstPlayer = new NormalPlayer();
        CooperatePlayer secondPlayer = new CooperatePlayer();
        Game game = new Game(new OutputPair(3, 0), 1, firstPlayer, secondPlayer);
        System.setIn(new ByteArrayInputStream("cheat".getBytes()));

        OutputPair outputPair = game.play();

        assertEquals(6, outputPair.player1Points);

    }

    @Test
    public void playWithCopyCatPlayer() throws IOException {
        NormalPlayer firstPlayer = new NormalPlayer();
        CopyCatPlayer secondPlayer = new CopyCatPlayer();
        Game game = new Game(new OutputPair(0, 0), 1, firstPlayer, secondPlayer);
        System.setIn(new ByteArrayInputStream("cooperate".getBytes()));

        OutputPair outputPair = game.play();

        assertEquals(-1, outputPair.player1Points);

    }


}

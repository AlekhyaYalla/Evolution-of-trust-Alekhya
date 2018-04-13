import java.io.IOException;

public class MainGame {

    public static void main(String args[]) throws IOException {
        NormalPlayer firstPlayer = new NormalPlayer();
        CopyCatPlayer secondPlayer = new CopyCatPlayer();
        Game game = new Game(new OutputPair(2, 1), 4, firstPlayer, secondPlayer);
        game.play();

    }
}

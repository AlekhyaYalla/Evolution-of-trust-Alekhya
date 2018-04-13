import java.io.IOException;

public class NormalPlayer implements PlayerBehaviour {

    public Input normalPlayerInput;

    @Override
    public Input getInput() throws IOException {
        normalPlayerInput = new ConsoleInputReader().readSingleInput();
        return normalPlayerInput;
    }

    @Override
    public void savePreviousInput(NormalPlayer secondPlayer) {

    }


}

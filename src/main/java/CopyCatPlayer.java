import java.io.IOException;

public class CopyCatPlayer implements PlayerBehaviour {

    private Input previousInputOfOtherPlayer = Input.COOPERATE;

    @Override
    public Input getInput() {
        return previousInputOfOtherPlayer;
    }

    public void savePreviousInput(NormalPlayer input) {
        previousInputOfOtherPlayer = input.normalPlayerInput;

    }
}

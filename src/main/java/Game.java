import java.io.IOException;

public class Game {


    private OutputPair scoreBoard;
    private int numberOfRounds;
    private PlayerBehaviour firstPlayer;
    private PlayerBehaviour secondPlayer;


    public Game(OutputPair scoreBoard, int numberOfRounds, PlayerBehaviour firstPlayer, PlayerBehaviour secondPlayer) {
        this.scoreBoard = scoreBoard;
        this.numberOfRounds = numberOfRounds;
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;

    }

    public OutputPair play() throws IOException {
        ConsolePrinter consolePrinter = new ConsolePrinter();
        InputPair input;
        for (int i = 0; i < numberOfRounds; i++) {
            input = getInputFromPlayers(firstPlayer, secondPlayer);
            savePreviousInput(firstPlayer, secondPlayer);
            updateScoreBoard(input, scoreBoard);
            consolePrinter.print(scoreBoard);
        }
        return scoreBoard;
    }

    private void savePreviousInput(PlayerBehaviour firstPlayer, PlayerBehaviour secondPlayer) {
        if (firstPlayer.getClass().equals(CopyCatPlayer.class)) {
            firstPlayer.savaPreviousInput(secondPlayer);
        } else if (secondPlayer.getClass().equals(CopyCatPlayer.class))
            secondPlayer.savePreviousInput((NormalPlayer) firstPlayer);

    }

    private InputPair getInputFromPlayers(PlayerBehaviour firstPlayer, PlayerBehaviour secondPlayer) throws IOException {

        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        if (firstPlayer.getClass().equals(secondPlayer.getClass()) && firstPlayer.getClass().equals(NormalPlayer.class))
            return consoleInputReader.read();

        return new InputPair(firstPlayer.getInput(), secondPlayer.getInput());

    }

    public void updateScoreBoard(InputPair input, OutputPair scoreBoard) {

        OutputPair outputPair;
        if (input.secondInput.equals(Input.CHEAT)) {
            outputPair = input.firstInput.cheat();
        } else {
            outputPair = input.firstInput.cooperate();
        }
        scoreBoard.player1Points += outputPair.player1Points;
        scoreBoard.player2Points += outputPair.player2Points;

    }


}

public enum Input {

    CHEAT,
    COOPERATE;

    public OutputPair cheat() {

        OutputPair outputPair = new OutputPair(0, 0);
        if (this.equals(Input.COOPERATE)) {
            outputPair.player1Points = -1;
            outputPair.player2Points = 3;
        }
        return outputPair;
    }

    public OutputPair cooperate() {
        OutputPair outputPair = new OutputPair(0, 0);
        if (this.equals(Input.CHEAT)) {
            outputPair.player1Points = 3;
            outputPair.player2Points = -1;
        } else {
            outputPair.player1Points = 2;
            outputPair.player2Points = 2;
        }
        return outputPair;
    }

}




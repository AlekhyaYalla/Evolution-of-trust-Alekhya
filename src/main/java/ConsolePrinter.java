public class ConsolePrinter {

    void print(OutputPair outputPair) {
        System.out.println("** Score Board **");
        System.out.println("Player 1: " + outputPair.player1Points);
        System.out.println("Player 2: " + outputPair.player2Points);
        System.out.println("\n");
    }
}

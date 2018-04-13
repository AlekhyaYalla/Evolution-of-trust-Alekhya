import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputReader {


    public InputPair read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        input = input.replaceAll(" ", "");
        String[] pair = input.split(",");
        return new InputPair(pair[0], pair[1]);
    }

    public Input readSingleInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        input = input.replaceAll(" ", "");

        return input.equals("cheat") ? Input.CHEAT : Input.COOPERATE;
    }



}

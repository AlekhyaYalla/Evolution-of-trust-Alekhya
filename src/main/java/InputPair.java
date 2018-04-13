
public class InputPair {

    protected Input firstInput;
    protected Input secondInput;

    public InputPair(String firstInput, String secondInput) {

        this.firstInput = convertFromStringToInput(firstInput);
        this.secondInput = convertFromStringToInput(secondInput);

    }

    public InputPair(Input firstInput, Input secondInput) {
        this.firstInput = firstInput;
        this.secondInput = secondInput;

    }

    private Input convertFromStringToInput(String value) {
        if (value.toLowerCase().equals("cheat"))
            return Input.CHEAT;
        else if (value.toLowerCase().equals("cooperate"))
            return Input.COOPERATE;
        return null;
    }
}

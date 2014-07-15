/**
 * Created by arianne on 2014-07-11.
 */
public class GuessingGameTestDrive {
    public static void main (String[] args) {
        GuessingGame gg = new GuessingGame();

        // Set number
        gg.num = 23;

        // Test if guess is too high
        Integer userGuess = 50;
        String testResult = "failed";

        String result = gg.acceptGuess(userGuess);

        if (result.equals("lower"))
            testResult = "passed";
        System.out.println(testResult);

        // Test if guess is too low
        testResult = "failed";
        userGuess = 20;

        result = gg.acceptGuess(userGuess);

        if (result.equals("higher"))
            testResult = "passed";
        System.out.println(testResult);

        // Test if guess is correct
        testResult = "failed";
        userGuess = 23;

        result = gg.acceptGuess(userGuess);

        if (result.equals("correct"))
            testResult = "passed";
        System.out.println(testResult);
    }
}

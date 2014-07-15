import java.util.ArrayList;

/**
 * Created by arianne on 2014-07-14.
 */
public class Ch6 {
    public static void main(String [] args) {
        GuessingGame gg = new GuessingGame();
        GameHelper helper = new GameHelper();
        ArrayList<Integer> guesses = new ArrayList<Integer>();

        gg.chooseRandomNumber();

        boolean correctGuess = false;

        while (!correctGuess) {
            Integer guess = helper.getUserInput("Guess a number between 1 and 100");
            if (guess != -1) {
                String result = gg.acceptGuess(guess);
                guesses.add(guess);

                if (result.equals("correct")) {
                    correctGuess = true;
                    System.out.println("That's it!");
                    System.out.println(guesses.toString());
                }
            }
        }
    }
}

/**
 * Created by arianne on 2014-07-11.
 */
public class Ch5 {
    public static void main(String [] args) {
        GuessingGame gg = new GuessingGame();
        GameHelper helper = new GameHelper();

        gg.chooseRandomNumber();

        boolean correctGuess = false;

        while (!correctGuess) {
            String guess = helper.getUserInput("Guess a number between 1 and 100");
            String result = gg.acceptGuess(guess);

            if (result.equals("correct")) {
                correctGuess = true;
                System.out.println("That's it!");
            }
        }
    }

}

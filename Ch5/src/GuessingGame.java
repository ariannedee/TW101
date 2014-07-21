/**
 * Created by arianne on 2014-07-11.
 */
public class GuessingGame {
    int num;

    public void chooseRandomNumber() {
        num = (int) (Math.random()*100) + 1;
    }

    public String acceptGuess(String userGuess) {
        int guess;
        try {
            guess = Integer.parseInt(userGuess);
        } catch (Exception e) {
            return "";
        }
        if (guess < 0 || guess > 100) return "";
        String result = "lower";
        if (num == guess)
            result = "correct";
        else if (num > guess)
            result = "higher";
        System.out.println(result);
        return result;
    }
}

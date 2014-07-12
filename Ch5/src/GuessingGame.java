/**
 * Created by arianne on 2014-07-11.
 */
public class GuessingGame {
    int num;

    public void chooseRandomNumber() {
        num = (int) (Math.random()*100) + 1;
    }

    public String acceptGuess(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = null;
        if (num == guess)
            result = "correct";
        else if (num > guess)
            result = "higher";
        else
            result = "lower";
        System.out.println(result);
        return result;
    }
}

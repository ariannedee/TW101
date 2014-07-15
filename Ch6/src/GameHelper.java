/**
 * Created by arianne on 2014-07-11.
 */

import java.io.*;

public class GameHelper {
    public Integer getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");

        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in)
            );
            inputLine = is.readLine();
            if (inputLine.length() == 0) return -1;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputAsInt(inputLine);
    }

    private Integer inputAsInt(String stringInput) {
        Integer asInt;
        try {
            asInt = Integer.parseInt(stringInput);
        } catch (NumberFormatException e) {
            return -1;
        }

        return isWithinRange(asInt);
    }

    private Integer isWithinRange(Integer i) {
        if(i < 1 || i > 100) {
            return -1;
        }
        return  i;
    }
}

/**
 * Created by arianne on 2014-07-09.
 */
public class Ch2 {
    public static void main (String [] args) {
        Counter c = new Counter();
        for (int i = 0; i < 5; i++) {
            c.increment();
        }
        c.total();
    }
}

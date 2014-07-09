/**
 * Created by arianne on 2014-07-09.
 */
public class Counter {
    private int increments = 0;

    public void increment() {
        increments ++;
    }

    public void total() {
        System.out.println("Total: " + increments);
    }
}

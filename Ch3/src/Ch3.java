/**
 * Created by arianne on 2014-07-09.
 */
public class Ch3 {
    public static void main(String [] args) {
        double sum = 0;
        double average;
        Rectangle[] rectangles = new Rectangle[5];

        for (int i=0; i<rectangles.length; i++) {
            Rectangle r = new Rectangle();
            r.height = Math.random() * 100;
            r.width = Math.random() * 100;

            rectangles[i] = r;
            System.out.println("Rectangle with width: " + r.width + " height: " + r.height + " and area: " + r.area());
            sum += r.area();
        }

        average = sum/rectangles.length;
        System.out.println("\nAverage = " + average);
    }
}

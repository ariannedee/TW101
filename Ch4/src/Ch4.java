/**
 * Created by arianne on 2014-07-11.
 */
public class Ch4 {
    public static void main(String [] args) {
        Rectangle[] rectangles = new Rectangle[5];

        for (int i=0; i<rectangles.length; i++) {
            double width = Math.random() * 100;
            double height = Math.random() * 100;
            Rectangle r = new Rectangle(width, height);

            rectangles[i] = r;
            System.out.println("Rectangle with width: " + width + " height: " + height);
        }

        double area = 0;
        double perimeter = 0;

        for (Rectangle r : rectangles) {
            area += r.area();
            perimeter += r.perimeter();
        }

        System.out.println("\nTotal area = " + area);
        System.out.println("Total perimeter = " + perimeter);
    }
}

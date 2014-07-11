/**
 * Created by arianne on 2014-07-11.
 */
public class Rectangle {
    private double height, width = 0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double area() {
        return height*width;
    }

    public double perimeter() {
        return 2 * (height + width);
    }
}

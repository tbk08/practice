package day_9;

public class Rectangle extends Figure {
    private int high;
    private int width;

    public Rectangle(String color, int high, int width) {
        super(color);
        this.high = high;
        this.width = width;
    }

    @Override
    public double area() {
        return high*width;
    }

    @Override
    public double perimeter() {
        return 2*(high+width);
    }
}

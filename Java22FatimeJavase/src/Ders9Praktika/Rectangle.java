package Ders9Praktika;

public class Rectangle {
	double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}

package Shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    public final double getRadius() {
        return radius;
    }
}

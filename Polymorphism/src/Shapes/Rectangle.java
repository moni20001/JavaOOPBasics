package Shapes;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.setHeight(height);
        this.setWidth(width);
    }

    private void setHeight(double height) {
        this.height = height;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return (this.height*2)+(this.width*2);
    }

    @Override
    double calculateArea() {
        return this.width*this.height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}

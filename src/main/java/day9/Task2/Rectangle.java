package day9.Task2;

public class Rectangle extends Figure {


   private double width;
   private double height;

    public Rectangle(double size1, double size2, String color) {
        super(color);
        this.width = size1;
        this.height = size2;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }


}

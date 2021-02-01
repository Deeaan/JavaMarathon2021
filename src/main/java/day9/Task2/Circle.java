package day9.Task2;

import static java.lang.StrictMath.PI;

public class Circle extends Figure{


    private double radiusOfCircle;

    public Circle(double size, String color) {
        super(color);
        this.radiusOfCircle = size;
    }

    @Override
    public double area() {
        return PI * radiusOfCircle * radiusOfCircle;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radiusOfCircle;
    }


}

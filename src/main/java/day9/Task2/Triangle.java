package day9.Task2;

public class Triangle extends Figure {


    private double lengthOfSide1;
    private double lengthOfSide2;
    private double lengthOfSide3;
    private double height;

    public Triangle(double size1, double size2, double size3, String color) {
        super(color);
        this.lengthOfSide1 = size1;
        this.lengthOfSide2 = size2;
        this.lengthOfSide3 = size3;

    }

    @Override
    public double area() {
        double hp = perimeter() / 2;
        return Math.sqrt(hp * (hp - lengthOfSide1) * (hp - lengthOfSide2) * (hp - lengthOfSide3));
    }

    @Override
    public double perimeter() {
        return lengthOfSide1 + lengthOfSide2 + lengthOfSide3;
    }

}

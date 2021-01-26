package day5;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Tesla");
        car1.setYearOfRelease(2019);
        car1.setColor("Black");

        System.out.println(car1.getModel());
        System.out.println(car1.getYearOfRelease());
        System.out.println(car1.getColor());

        System.out.println();

        Car car2 = new Car();
        car2.setModel("Porshe");
        car2.setYearOfRelease(2020);
        car2.setColor("White");

        System.out.println(car2.getModel());
        System.out.println(car2.getYearOfRelease());
        System.out.println(car2.getColor());


    }
}

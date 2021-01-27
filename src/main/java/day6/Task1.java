package day6;

public class Task1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1.yearDifference(2000));
        car1.info();


        System.out.println();


        Motorbike motorbike1 = new Motorbike("Harley", 2002,"green");
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2000));
    }
}

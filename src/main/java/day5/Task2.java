package day5;


public class Task2 {
    public static void main(String[] args) {

        Motorbike motorbike1 = new Motorbike("Harley-Davidson", 2005, "Dark-green");

        System.out.println(motorbike1.getModel());
        System.out.println(motorbike1.getYearOfRelease());
        System.out.println(motorbike1.getColor());

        System.out.println();

        Motorbike motorbike2 = new Motorbike("Ducati", 2007, "Black");

        System.out.println(motorbike2.getModel());
        System.out.println(motorbike2.getYearOfRelease());
        System.out.println(motorbike2.getColor());
    }
}

package day5;

public class Task1 {
    public static void main(String[] args) {

        Car tesla = new Car();
        tesla.setModel("Tesla Model X");
        tesla.setYearOfRelease(2015);
        tesla.setColor("Black");

        System.out.println(tesla.getModel());
        System.out.println(tesla.getYearOfRelease());
        System.out.println(tesla.getColor());

        System.out.println();

        Car porsche = new Car();
        porsche.setModel("Porsche 911");
        porsche.setYearOfRelease(2020);
        porsche.setColor("White");

        System.out.println(porsche.getModel());
        System.out.println(porsche.getYearOfRelease());
        System.out.println(porsche.getColor());


    }
}

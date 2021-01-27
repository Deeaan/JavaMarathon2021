package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Boeing", 2007,70,180000);
        airplane1.info();

        System.out.println();

        Airplane airplane2 = new Airplane("Boeing", 2005,75,190000);
        airplane2.setYear(2008);
        airplane2.setLength(80);
        airplane2.fillUp(5000);
        airplane2.info();
    }
}

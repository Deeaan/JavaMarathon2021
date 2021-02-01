package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student s1 = new Student("Bob","A1 Math1");
        System.out.println(s1.toString());
        s1.printInfo();

        System.out.println();

        Teacher t1 = new Teacher("Pavel", "Math1");
        System.out.println(t1.toString());
        t1.printInfo();

    }
}

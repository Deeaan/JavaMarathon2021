package day9.Task1;

public class Student extends Human{

    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.name);
    }

//    @Override
//    public void printInfo() {
//        System.out.println("Этот человек с именем " + super.name);
//        System.out.println("Этот студент с именем " + super.name);
//    }

    @Override
    public String toString() {
        return name;
    }

}

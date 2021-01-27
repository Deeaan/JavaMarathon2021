package day6;


public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }


   public int evaluate(Student student) {
       int ran = (int) (2 + Math.random() * 4);
       if (ran == 5) {
           System.out.println("отлично");
       } else if (ran == 4) {
           System.out.println("хорошо");
       } else if (ran == 3) {
           System.out.println("удовлетворительно");
       } else if(ran == 2) {
           System.out.println("неудовлетворительно");
       }

       System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + ran + ".");
       return ran;

   }


}

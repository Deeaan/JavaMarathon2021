package day8;

public class Task1 {
    public static void main(String[] args) {


//        long start = System.currentTimeMillis();
//
//        String str = new String(" ");
//        for (int i = 0; i < 20001; i++){
//            System.out.print(str + i);
//        }
//        //System.out.println(str + i);
//
//        System.out.println("\n");
//        long finish = System.currentTimeMillis();
//        long timeConsumedMillis = finish - start;
//        System.out.println(timeConsumedMillis);



        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < 20001; i++){
            sb.append(i + " ");
        }
        System.out.print(sb.toString());

        System.out.println("\n");
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);


    }

}

package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if(a >= b){
            System.out.println("Некорректный ввод");
        }else{
            int i = a;
            while(i < b){
                i++;
                a++;
            if(a < b && a % 5 == 0 && a % 10 != 0){
                System.out.print(a + " ");
            }
            }
        }
    }
}

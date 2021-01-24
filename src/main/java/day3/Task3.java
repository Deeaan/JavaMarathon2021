package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        for(int i = 0; i < 5; i++){

            double num1 = scn.nextDouble();
            double num2 = scn.nextDouble();

            if(num2 == 0 || (num1 == 0 && num2 == 0)){
                System.out.println("Деление на 0");
                continue;
            }

            double res = num1 / num2;
            System.out.println(res);

        }
    }
}

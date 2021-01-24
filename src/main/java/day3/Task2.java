package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while(true){

            double num1 = scn.nextDouble();
            double num2 = scn.nextDouble();

            if(num2 == 0){
                break;
            }
            double res = num1 / num2;
            System.out.println(res);
        }
    }

}
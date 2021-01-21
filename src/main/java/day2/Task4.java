package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        double x = scn.nextDouble();

        if(x >= 5){
            double y = ((x * x) - 10.0) / (x + 7.0);
            System.out.println(y);
        }else if(x > -3 && x < 5){
            double y = ((x + 3.0)) * ((x * x) + 2.0 -4);
            System.out.println(y);
        }else{
            double y = 420.0;
            System.out.println(y);
        }

    }
}

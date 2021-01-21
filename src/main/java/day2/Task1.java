package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int floors = scn.nextInt();
        if(floors >= 1 && floors <= 4){
            System.out.println("Малоэтажный дом");
        }else if(floors == 5 && floors <= 8){
            System.out.println("Среднеэтажный дом");
        }else if(floors >= 9){
            System.out.println("Многоэтажный дом");
        }else{
            System.out.println("Ошибка ввода");
        }
    }
}

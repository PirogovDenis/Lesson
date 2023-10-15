package lesson2;

import java.util.Scanner;

public class FirstLesson {

    public static void main(String[] args) {
        //   int number = 10;
        //   if (number > 0) {
        //      System.out.println("10 больше 0");
        //   } else if (number == 0) {
        //      System.out.println("number равен 0");

        //   } else {

        //      System.out.println("10 меньше 0");
        //    }

        int mec = 2;
        if (mec == 12 || mec == 1 || mec == 2) {
            System.out.println("зима");
        } else if (mec == 3 || mec == 4 || mec == 5) {
            System.out.println("весна");
        } else if (mec == 6 || mec == 7 || mec == 8) {
            System.out.println("лето");
        } else if (mec == 9 || mec == 10 || mec == 11) {
            System.out.println("осень");
        }

        int r = 23;
        int i = 100;
        int f = r % i;

        if (r <= 1) {
            System.out.println("Рубль");


        } else if (r >= 2 && r <= 4 || r >= i) {
            System.out.println("Рубля");


    } else if (r >= 5 && r <= i)
            System.out.println("Рублей");




   }
}

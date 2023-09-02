package Lesson2;

import java.util.Random;
import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("""
                ===========================
                         Тут Тестит 
                            Денис
                ===========================""");

        Scanner in = new Scanner(System.in); //Создание объекта, который может читать input из консоли
        System.out.print("Введите 1е число: ");

            int a = in.nextInt();            //Вызов метода объекта Scanner для чтения целого числа, которое пользователь вводит в консоль и сохранение ее в переменную.

        System.out.print("Введите 2е число: ");

            int b = in.nextInt();
            int c = a + b;
            System.out.println("Сумма чисел :" + c);

            Random random = new Random();
            int i = random.nextInt(c);

            System.out.println("Рандом число, не выше суммы сложения : " + i);

//Проверка Рандомного числа на четность

            if (i % 2 == 0) {
                System.out.println("Наше число \n чётное");

            } else {
                System.out.println("Наше число \n нечётное");

            }
        }
    }

package Lesson3;

<<<<<<< HEAD
import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {

        // Сложение массивов
        int[] mas1 = {1, 2, 3, 4, 5, 6};
        int[] mas2 = {5, 3, 6, 3, 6, 4};
        int[] sum = new int[mas1.length + mas2.length];
        int e = 0;

        for (int i = 0; i < mas1.length; i++) {
            sum[e] = mas1[i];
            e++;
        }
        for (int a = 0; a < mas2.length; a++) {
            sum[e++] = mas2[a];
        }
        for (int i = 0; i < sum.length; i++)

            System.out.println("+" + sum[i]);

        // Добавляем в массив первые 10 чисел которые делятся на 13 и 17
        int[] mas3 = new int[10];
int g = 0;
int f = 10;

        while (g < 10)  {
            if (f % 13 == 0 || f % 17 == 0) {
                mas3[g] = f;
                System.out.print("+" +mas3[g]);
                g++;
            }
            f++;
        }

    }
}


=======
public class Lesson3 {
    public static void main(String[] args) {




    }
}
>>>>>>> origin/lesson

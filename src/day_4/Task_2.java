package day_4;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomArray = new int[100];
        for (int i = 0; i < 100; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        int max = randomArray[0];
        int min = randomArray[0];
        for (int i : randomArray
        ) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
        int counter = 0;
        int sum = 0;
        for (int i : randomArray
        ) {
            if (i % 10 == 0) {
                counter++;
                sum += i;
            }
        }
        System.out.println(counter);
        System.out.println(sum);

    }
}

package day_4;

import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        int[] randomArray = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomArray[i] = random.nextInt(10000);
        }
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < 98; i += 2) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += randomArray[j];
            }
            if (maxSum < sum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}

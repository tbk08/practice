package day_4;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(10);
        }
        System.out.println("Длина массива " + n);
        int[] counters = new int[5];
        System.out.print("[");
        for (int i : a
        ) {
            System.out.print(i+" ");
            if (i > 8) {
                counters[0]++;
            }
            if (i == 1) {
                counters[1]++;
            }
            if (i % 2 == 0) {
                counters[2]++;
            }
            if (i % 2 != 0) {
                counters[3]++;
            }
            counters[4] += i;
        }
        System.out.println("]");
        System.out.println("Количество чисел больше 8: " + counters[0]);
        System.out.println("Количество чисел равных 1: " + counters[1]);
        System.out.println("Количество четных чисел: " + counters[2]);
        System.out.println("Количество нечетных чисел: " + counters[3]);
        System.out.println("Сумма всех элементов массива: " + counters[4]);
    }
}

package day_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("some_numbers.txt");
        printResult(file);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int count = 0;
        int sum = 0;

        while (scanner.hasNext()) {
            sum += scanner.nextInt();
            count++;
        }
        double arif = (double) sum / count;
        System.out.println(arif);
        System.out.printf("%.3f", arif);
    }
}

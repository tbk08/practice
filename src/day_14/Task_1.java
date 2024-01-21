package day_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        File file = new File("numbers.txt");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            int sum = 0;
            int counter = 0;
            while (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            }
            if (counter != 10) {
                throw new IllegalArgumentException();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}

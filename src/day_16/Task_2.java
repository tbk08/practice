package day_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");

        Random random = new Random();
        PrintWriter printWriter = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++) {
            printWriter.println(random.nextInt(100));
        }
        printWriter.close();

        File file2 = new File("file2.txt");
        Scanner scanner = new Scanner(file1);
        PrintWriter printWriter1 = new PrintWriter(file2);
        int count = 0;
        int sum = 0;

        while (scanner.hasNext()) {
            sum += scanner.nextInt();
            count++;
            if (count == 20) {
                double arif = (double) sum / count;
                printWriter1.println(arif);
                sum = 0;
                count = 0;
            }
        }
        printWriter1.close();

        printResult(file2);

    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        double sum = 0;

        while (scanner.hasNext()) {
            String s = scanner.next();
            sum += Double.parseDouble(s);
        }
        System.out.println((int) sum);
    }
}

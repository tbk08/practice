package day_15;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("shoes.csv");
        Scanner scanner = new Scanner(file);
        List<Sklad> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] strings = s.split(";");
            Sklad sklad = new Sklad(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
            list.add(sklad);
        }

        File file1 = new File("missing_shoes.txt");
        PrintWriter printWriter = new PrintWriter(file1);
        for (Sklad s : list
        ) {
            if (s.getCount() == 0) {
                printWriter.println(s);
            }
        }
        printWriter.close();
    }
}

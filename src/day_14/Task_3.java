package day_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());
    }

    public static List<Person> parseFileToObjList(){
        File file = new File("people.txt");
        List<Person> names = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                Person person = new Person(scanner.next(),scanner.nextInt());
                names.add(person);
            }
            for (Person age : names
            ) {
                if (age.getAge()<0) {
                    throw new IllegalArgumentException();
                }
            }
            return names;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return new ArrayList<>();
    }
}

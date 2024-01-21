package day_12;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<String> listSongs = new ArrayList<>();
        listSongs.add("BMW");
        listSongs.add("BYD");
        listSongs.add("Mazda");
        listSongs.add("KIA");
        listSongs.add("Mercedes");

        System.out.println(listSongs);

        listSongs.add(listSongs.size()/2,"Audi");

        System.out.println(listSongs);

        listSongs.remove(0);

        System.out.println(listSongs);

    }
}

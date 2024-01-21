package day_12.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("a", 1999);
        MusicBand musicBand2 = new MusicBand("b", 1998);
        MusicBand musicBand3 = new MusicBand("c", 1997);
        MusicBand musicBand4 = new MusicBand("d", 1996);
        MusicBand musicBand5 = new MusicBand("r", 2000);
        MusicBand musicBand6 = new MusicBand("e", 2001);
        MusicBand musicBand7 = new MusicBand("w", 2002);
        MusicBand musicBand8 = new MusicBand("q", 2003);
        MusicBand musicBand9 = new MusicBand("y", 2004);
        MusicBand musicBand10 = new MusicBand("p", 2005);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        System.out.println(groupsAfter2000(musicBands));


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand m : bands
        ) {
            if (m.getYear() >= 2000) {
                bandsAfter2000.add(m);
            }
        }
        return bandsAfter2000;
    }
}

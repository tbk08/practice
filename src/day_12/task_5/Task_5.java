package day_12.task_5;

import java.util.ArrayList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        List<MusicArtist> memberListAA = new ArrayList<>();
        memberListAA.add(new MusicArtist("AA1", 24));
        memberListAA.add(new MusicArtist("AA2",44));
        List<MusicArtist> memberListBB = new ArrayList<>();
        memberListBB.add(new MusicArtist("BB1",43));
        memberListBB.add(new MusicArtist("BB2",23));
        List<MusicArtist> memberListCC = new ArrayList<>();
        memberListCC.add(new MusicArtist("CC1",42));
        memberListCC.add(new MusicArtist("CC2",52));


        MusicBand musicBand1 = new MusicBand("AAA", 2000, memberListAA);
        MusicBand musicBand2 = new MusicBand("BBB", 2001, memberListBB);
        MusicBand musicBand3 = new MusicBand("CCC", 1999, memberListCC);

        System.out.println(musicBand1);
        System.out.println(musicBand2);
        System.out.println(musicBand3);

        MusicBand.transferMembers(musicBand1,musicBand2);
        System.out.println(musicBand2);
        System.out.println(musicBand1);

        musicBand3.printMembers();


    }
}

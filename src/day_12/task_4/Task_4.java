package day_12.task_4;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        List<Member> memberListAA = new ArrayList<>();
        memberListAA.add(new Member("AA1"));
        memberListAA.add(new Member("AA2"));
        List<Member> memberListBB = new ArrayList<>();
        memberListBB.add(new Member("BB1"));
        memberListBB.add(new Member("BB2"));
        List<Member> memberListCC = new ArrayList<>();
        memberListCC.add(new Member("CC1"));
        memberListCC.add(new Member("CC2"));


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

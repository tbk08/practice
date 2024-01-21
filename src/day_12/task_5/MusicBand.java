package day_12.task_5;

import java.util.List;

public class MusicBand {
    private String name;
    private List<MusicArtist> members;

    public List<MusicArtist> getMembers() {
        return members;
    }

    private int year;

    public MusicBand(String name, int year, List<MusicArtist> memberList) {
        this.name = name;
        this.year = year;
        this.members = memberList;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", members=" + members +
                ", year=" + year +
                '}';
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (MusicArtist m : musicBand1.getMembers()
        ) {
            musicBand2.getMembers().add(m);
        }
        musicBand1.getMembers().clear();
    }
    public void printMembers(){
        System.out.println(this.members);
    }
}

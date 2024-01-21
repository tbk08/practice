package day_12.task_3;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand:" +
                "name='" + name + '\'' +
                ", year=" + year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

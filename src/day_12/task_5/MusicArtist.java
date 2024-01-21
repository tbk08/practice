package day_12.task_5;

public class MusicArtist {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "MusicArtist{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public MusicArtist(String name, int age) {
        this.age = age;
        this.name = name;
    }

}

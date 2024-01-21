package day_12.task_4;

public class Member {
    private String name;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Member(String name) {
        this.name = name;
    }
}

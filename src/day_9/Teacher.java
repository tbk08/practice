package day_9;

public class Teacher extends Human {
    private String subject;

    public String getSubject() {
        return subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
}

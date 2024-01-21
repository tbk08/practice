package day_9;

public class Task_1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("H", "Math");
        System.out.println(teacher.getSubject());
        teacher.printInfo();
        Student student = new Student("G", "201-20");
        System.out.println(student.getGroup());
        student.printInfo();

    }
}

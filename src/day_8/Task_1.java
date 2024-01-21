package day_8;

public class Task_1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String s = "";
        for (int i = 0; i <= 20_000; i++) {
            s += i + " ";
        }
        System.out.println(s);

        long endTime = System.currentTimeMillis();
        System.out.println("Class String " + (endTime - startTime));
        startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20_000; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
        endTime = System.currentTimeMillis();
        System.out.println("Class StringBuilder "+ (endTime - startTime));


    }
}

package day_7;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
//        Airplane airplane = new Airplane("China", 1222, 120, 132);
//        Airplane airplane1 = new Airplane("Uzb", 1221, 142, 432);
//        Airplane.compareAirplanes(airplane, airplane1);
        Random random = new Random();

        Player player = new Player(random.nextInt(100 - 90) + 90);
        Player player1 = new Player(random.nextInt(100 - 90) + 90);
        Player player2 = new Player(random.nextInt(100 - 90) + 90);
        Player player3 = new Player(random.nextInt(100 - 90) + 90);
        Player.info();
        Player player4 = new Player(random.nextInt(100 - 90) + 90);
        Player player5 = new Player(random.nextInt(100 - 90) + 90);
        Player.info();

    }
}

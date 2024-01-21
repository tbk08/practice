package day_4;

import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] randomMatrix = new int[12][8];
        int[] sum = new int[12];
        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] = random.nextInt(50);
                sum[i] += randomMatrix[i][j];
            }
        }

        int max = sum[0];

        for (int i : sum
        ) {
            if (max <= i) {
                max = i;
            }
        }

        for (int i = 0; i < 12; i++) {
            if (sum[i] == max) {
                System.out.println(i);
                break;
            }
        }


    }
}

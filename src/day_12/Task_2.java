package day_12;

import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> oddIntegers = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            if(i%2==0)
                oddIntegers.add(i);
        }
        for (int i = 300; i < 351; i++) {
            if(i%2==0)
                oddIntegers.add(i);
        }
        System.out.println(oddIntegers);
    }
}

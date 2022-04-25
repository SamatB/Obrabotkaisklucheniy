package Lesson23ArrayList.HomeTask23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static List ints (int size, int min, int max) {
        Random random = new Random();
        List res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println(res.add(random.nextInt(max - min) + min));
        } return res;
    }

    public static void main(String[] args) {
        ints(50,1,100);
    }
}

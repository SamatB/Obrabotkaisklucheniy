package Lesson23ArrayList.HomeTask23;

import java.util.ArrayList;
import java.util.Random;

public class Randomnums {
    public static ArrayList<Integer> getRandom (int range, int size) {
        ArrayList<Integer> randNums = new ArrayList<>();
        for(int i = 0; i < size; i++)
            randNums.add(i, new Random().nextInt(range));
        return randNums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> random;
        random = getRandom(100,50);
        System.out.println("Random numbers: ");
        for(int i = 0; i < random.size(); i++)
            System.out.println(i + ": " + random.get(i));

        System.out.println("------------------");

        ArrayList<Integer> oddNums;
        System.out.println("Random odd numbers: ");
        oddNums = getRandom(100, 50);
        for (int j = 0; j < oddNums.size(); j++) {
            if (oddNums.get(j) % 2 == 1) {
                System.out.println(j + ": " + oddNums.get(j));
            }
        }

        System.out.println("----------------");
        System.out.println("Random even numbers: ");
        ArrayList<Integer> evenNums;
        evenNums = getRandom(100, 50);
        for (int k = 0; k < evenNums.size(); k++) {
            if (evenNums.get(k) % 2 == 0) {
                System.out.println(k + ": " + evenNums.get(k));
            }
        }
     }

}

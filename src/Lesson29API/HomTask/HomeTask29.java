package Lesson29API.HomTask;

import java.util.Arrays;

public class HomeTask29 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17};
       int nums = Arrays.stream(numbers).map(x -> x % 2 == 0 ? (int) Math.sqrt(x) : 0).max().getAsInt();
        System.out.print("Массивдин жуп сандарынын квадраттарынын эн чону: " +  nums);
    }
}

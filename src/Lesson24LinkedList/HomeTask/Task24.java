package Lesson24LinkedList.HomeTask;

import java.util.*;

public class Task24{
    public static void main(String[] args) {
        sort(new int[10]);
        sort(new ArrayList<>());
        sort(new LinkedList<>());

    }
    public static void  sort (int [] nums) {
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(2);
        }
        Arrays.sort(nums);
        System.out.println("Array: " + Arrays.toString(nums));
    }
    public static void sort (ArrayList<Integer> nums2) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            nums2.add(i, random.nextInt(2));
        }
        Collections.sort(nums2);
        System.out.println("ArrayList: " + nums2);
    }
    public static void sort(LinkedList<Integer> nums3) {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            nums3.add(i, random.nextInt(2));
        }
        Collections.sort(nums3);
        System.out.println("LinkedList: " + nums3);
    }
}

package Lesson26Generic;

public class LessonTask {
    public static void main(String[] args) {
        method(new Object[] {1, 2, 3, 4, "Sam"});
    }
    public static <T> void method (T [] arr){
        System.out.println(arr[0]);
        for (T e: arr) {
            System.out.println(e);
        }
    }
}

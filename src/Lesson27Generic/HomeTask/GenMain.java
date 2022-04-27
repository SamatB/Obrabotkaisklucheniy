package Lesson27Generic.HomeTask;

public class GenMain {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(12, 34, 45);
        System.out.println(Box.generic(box));
    }
}

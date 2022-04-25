package Lesson23ArrayList.Task;


import java.util.ArrayList;

public class MainS {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            students.add(new Student("Мухаммед", 25));
            students.add(new Student("Самат", 26));
            students.add(new Student("Асель", -1));
            students.add(null);

            for (Student st: students) {
                System.out.println(st);
            }
            System.out.println(students.get(10));
        } catch (MyException | NullPointerException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Бутту");
        }
    }
}

package Lesson20TryCatch.Task;

public class MainCar {
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            e.getMessage();
        }
    }

    public static void method () throws  RuntimeException{
        try (Car car = new Car("Black", (short) 2015, "15000$")) {
            car.drive();
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("You should to remake your code.");;
       }
    }
}

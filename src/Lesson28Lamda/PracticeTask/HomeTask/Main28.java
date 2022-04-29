package Lesson28Lamda.PracticeTask.HomeTask;

import java.util.function.UnaryOperator;

public class Main28 {
    public static void main(String[] args) {
        System.out.printf("The square root result: " +"%.2f",sqrt().apply(18.4));
    }
    public static UnaryOperator<Double> sqrt(){
        UnaryOperator<Double> u1 = num -> Math.sqrt(num);
        return u1;
    }

}

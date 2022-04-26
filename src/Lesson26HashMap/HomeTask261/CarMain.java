package Lesson26HashMap.HomeTask261;

import java.util.HashMap;
import java.util.Map;

public class CarMain {
    public static void main(String[] args) {

        HashMap<Car, CarData> car = new HashMap<>();
        car.put(new Car(1, 013), new CarData(2004, "BMW e60", "5000 $", "Black"));
        car.put(new Car(2, 021), new CarData(2010, "MB s500", "10000 $", "Red"));
        car.put(new Car(3, 033), new CarData(2014, "Aston Martin M4", "20000 $", "Blue"));
        car.put(new Car(4, 0432), new CarData(2021, "Kia Cee'd SW", "18000 $", "Yellow"));
        for(Map.Entry val : car.entrySet()) {
            System.out.println(val.getKey() + " -- " + val.getValue());
        }
    }
}

package Lesson26HashMap.HomeTask262;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CityMain {
    public static void main(String[] args) {
        Set<City> cities2 = new TreeSet<>();
        HashSet<City> cities = new HashSet<>();
        cities.add(new City(1, "New-York"));
        cities.add(new City(2, "Moscow"));
        cities.add(new City(3, "Beijing"));
        cities.add(new City(4, "Bishkek"));
        cities.add(new City(5, "London"));

        for (City a : cities) { //жон эле озум учун кошуп койдум бул for each ти
            System.out.println(a);
        }
        System.out.println("------");
        System.out.println("Cities with odd codes: ");

        for (City e : cities) {
            if (e.getCode() % 2 != 0) {
                new TreeSet<>(cities);
                System.out.println(e);
            }

        }
    }
}

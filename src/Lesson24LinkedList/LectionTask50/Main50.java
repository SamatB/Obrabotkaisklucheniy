package Lesson24LinkedList.LectionTask50;


import java.util.ArrayList;
import java.util.Iterator;

public class Main50 {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
    int count = 0;
        for(int i = 0; i < 50; i++) {
            dogs.add(new Dog());
            count++;
//            System.out.println(count +": " + dogs.get(i));
        }
        Iterator<Dog> it = dogs.iterator();
        while (it.hasNext()){
            if(it.next().equals(dogs.get(5))){
                it.remove();
            }
        }

        for (Dog dd: dogs) {
            count++;
            System.out.println(count +": " + dd);
        }

        ArrayList<Cat> cats = new ArrayList<>();
        int count2 = 0;
        for (int i = 0; i < 50; i++) {
            cats.add(i, new Cat(1, "Cat"));
            count2++;
            System.out.println(count2 + ": " + cats.get(i));
        }
    }
}

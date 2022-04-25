package Lesson25HashSet.HomeTask;

import java.util.HashSet;
import java.util.Set;

public class Task25 {
    public static void main(String[] args) {
        System.out.println(symmetricDifference(new HashSet<>(), new HashSet<>()));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static boolean symmetricDifference (Set<Integer> set1, Set<Integer> set2) {
     set1.add(1);
     set1.add(2);
     set1.add(3);

     set2.add(0);
     set2.add(1);
     set2.add(2);

        return set1 != set2;
    }
}

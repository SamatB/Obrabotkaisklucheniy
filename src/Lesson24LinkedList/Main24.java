package Lesson24LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Main24 {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Sam", 25));
        students.add(new Student("Maga", 26));
        students.add(new Student("Asel", 21));
        students.add(new Student("Muhammed", 22));
       // Collections.sort(students);
        Collections.sort(students, Student.compareByNameAscendingOrder);
        for (Student e: students) {
            System.out.println(e);
        }

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(123);
//        linkedList.add(123);
//        linkedList.add(123);
//        linkedList.addFirst(34);
//        linkedList.add(1,465687);
//        linkedList.set(4, 567);
//
//
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.println(linkedList.get(i));
//        }
//        System.out.println(linkedList.contains(27));
//       //linkedList.clear();
//        System.out.println(linkedList.size());
////        System.out.println(linkedList.addAll());
//        linkedList.remove(1);
//        linkedList.removeFirstOccurrence(34);
//        linkedList.poll();
//        linkedList.peek();
//        linkedList.element();
//        linkedList.offerLast(27);
//        linkedList.offer(77);
//
//        Iterator<Integer> iterator = linkedList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
////        for (Integer e: linkedList) {
////            System.out.println(e);
////        }
//
//        Collections.sort(linkedList);
//        System.out.println(linkedList);
    }

}

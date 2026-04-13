package set;


import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

    public static  void main(String[]args){

        SortedSet s = new TreeSet();

        /*Sorted set is interface, so we can not create object
         of interface. We can  create reference of sorted set
         and object of it's implementation class and then
         can  assign object to it's reference.
         */

         s.add(5);
         s.add(10);
         s.add(15);
         s.add(2);
         s.add(9);
         s.add(18);

         System.out.println(s);  // [2, 5, 9, 10, 15, 18]

        System.out.println(s.first());                       // 2
        System.out.println(s.last());                        // 18
        System.out.println(s.headSet(10));          // [2, 5, 9]
        System.out.println(s.tailSet(10));        // [10, 15, 18]
        System.out.println(s.subSet(5,15));                 //  [5, 9, 10]

        System.out.println(s.comparator());                // null


        // Methods of sorted set apart from inherited collection methods.
        // Object first()
        // Object last()
        // SortedSet headSet(Object o)
        // SortedSet tailSet(Object o, object p)
        // Comparator comparator();         For natural sorting order it returns null


    }
}

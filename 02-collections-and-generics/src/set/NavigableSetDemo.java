package set;

import java.util.*;
import java.util.NavigableSet;

public class NavigableSetDemo {

    public static  void main(String[]args){

        NavigableSet<Integer> data = new TreeSet<Integer>();
        data.add(100);
        data.add(300);
        data.add(1300);
        data.add(4000);
        data.add(5100);

        System.out.println("Tree Set");
        System.out.println(data);     //[100, 300, 1300, 4000, 5100]

        //Methods

        System.out.println(data.floor(2000));   //1300

        /* floor()  returns the greatest element in this set less than
         or equal to the given element, or null if there is no such element
         exists in  the set.
         */

        System.out.println(data.floor(4000));  // 4000

        System.out.println(data.lower(1300));   // 300
         /* lower() returns the greatest element in the set
        which is less than the given element or NULL if no
        such element exist.
         */

        System.out.println(data.ceiling(300));  // 300

        /* ceiling() returns the least element in this set greater than
         or equal to  the given element, or null if there is no such element.
         */

        System.out.println(data.ceiling(1800));  // 4000


        System.out.println(data.higher(4000));   // 5100
        /* higher() returns the least element in the set
        which is greater than the given element or NULL if no
        such element exist.
         */

        System.out.println(data.pollFirst());       // 100
        /* Retrieve and remove the first least element or
        return NULL if there is no such element.
         */

        System.out.println(data.pollLast());        // 5100
        /* Retrieve and remove the last highest element or
        return NULL if there is no such element.
         */


        System.out.println(data.descendingSet());  // [4000, 1300, 300]


    }

}

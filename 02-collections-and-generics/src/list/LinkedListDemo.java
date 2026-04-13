package list;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[]args){
        LinkedList l = new LinkedList();

      //  LinkedList ll = new LinkedList(Collection c); // equivalent linked list will be created for whatever  collection we pass

        l.add("Hello");
        l.add(10);
        l.add(null);
        System.out.println(l);                        // [Hello, 10, null]
        l.set(1, 13);
        System.out.println(l);                        // [Hello, 13, null]
        l.add(2, true);
        System.out.println(l);                       // [Hello, 13, true, null]
        l.removeFirst();
        System.out.println(l);                       // [13, true, null]
        l.addFirst(1);
        System.out.println(l);                       // [1, 13, true, null]

    }

}

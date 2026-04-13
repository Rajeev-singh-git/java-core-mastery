package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class arrayList {


    public static void main(String[]args) {


        ArrayList al = new ArrayList();  // creates an empty arrayList of size 10

        ArrayList alist = new ArrayList(30); // creates arraylist of size 30

        //ArrayList alist1 = new ArrayList(Collection c); // It will return equivalent arraylist of collection obj.

        al.add("John");
        al.add(true);
        al.add(10);
        System.out.println(al);                           //[John, true, 10]
        al.remove(1);
        System.out.println(al);                           //[John, 10]
     //   al.remove(new Integer(10));
        System.out.println(al);                           //[John]

        System.out.println(al.get(0));                   // John


        /* If we know , what kind of object our Arraylist is going to hold
           then we should use generic syntax.
           Suppose, arraylist is going to hold only String Object.
         */

        ArrayList<String> strList = new ArrayList<String>();

    }

}

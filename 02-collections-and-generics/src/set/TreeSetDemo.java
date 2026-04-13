package set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[]args){

        TreeSet ts = new TreeSet();  //create treeset obj. where element will be inserted in default sorting order

   //     TreeSet ts1 = new TreeSet(Comparator c);
   /* If we don't want default sorting order, we can
   make our own customized sorting order
    */

        SortedSet s = new TreeSet();
        TreeSet ts2 = new TreeSet(s);

        HashSet hs = new HashSet();
        TreeSet ts3 = new TreeSet(hs); // will get equivalent treeset of hashset

        TreeSet<Employee> ts4 = new TreeSet<Employee>();
        ts4.add(new Employee("Raj",300000));


    }

}

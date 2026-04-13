package map;

import set.MySorting;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[]args){

        TreeMap m = new TreeMap();

        TreeMap m1 = new TreeMap(new MySort());
        SortedMap s =  new TreeMap();
        TreeMap m2 = new TreeMap(s);

        Map m4 = new HashMap();
        TreeMap m3 = new TreeMap(m4);

        m.put(23,"");
        m.put(10,"");
        m.put(10," Basics");
        m.put(11,"Strong ");
        System.out.println(m);  // {10= Basics, 11=Strong , 23=}

        m1.put("Rajeev",10);
        m1.put("Raj",10);
        m1.put("Singh", 15);

        System.out.println(m1);  // {Singh=15, Rajeev=10, Raj=10}

   }
}

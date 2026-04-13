package set;

import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String[]args){



        TreeSet data = new TreeSet();
        data.add(152);
        data.add(10);
        data.add(300);
        data.add(600);
        data.add(50);

        System.out.println(data);  // [10, 50, 152, 300, 600]

        /* When we don't provide any obj. inside TreeSet
          constructor JVM will go for compareTo() of comparable interface.
         */

        TreeSet datas = new TreeSet(new MySorting());
        datas.add(152);
        datas.add(10);
        datas.add(300);
        datas.add(600);
        datas.add(50);

        System.out.println(datas);  // [600, 300, 152, 50, 10]

         /* When we  provide obj. of comparator inside TreeSet
           constructor, then JVM will go for compare() method
           of comparator  interface that we implemented using MySorting
           class.
         */

    }
}

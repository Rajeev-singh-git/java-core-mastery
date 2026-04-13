package list;

import java.util.Vector;

public class vectorDemo {
    public static void main(String[]args){
        Vector v = new Vector();                  //Empty vector of size 10 will be created
        Vector vec = new Vector(60);  // vector of size 60 will be created

        /* when vector capacity is full and if we try to add new element
        vector capacity will increase by double.
        To stop memory wastage, we can set how much capacity should be incremented.
        */

        Vector vec1 = new Vector(100, 5);  /*  vector with initial capacity of 100 will be created,
                                                                        when capacity is full, size will increase by 5 */

        v.add(10);
        v.addElement("Hello");
        System.out.println(v);                              //  [10, Hello]
        v.remove(1);
        System.out.println(v);                              //   [10]
        System.out.println(v.elementAt(0));           //    10

        //get

        System.out.println(v.firstElement());               // 10
        System.out.println(v.lastElement());                // 10
        System.out.println(v.get(0));                       // 10





    }

}

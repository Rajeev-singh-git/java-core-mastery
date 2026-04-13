package set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static  void main(String[]args){

        LinkedHashSet lhs = new LinkedHashSet(); //Default Capacity 16
        LinkedHashSet lhs1 = new LinkedHashSet(20); //Linked hash set with capacity 20 is created

        LinkedHashSet lhs2 = new LinkedHashSet(30,1.00f); // Capacity = 30, load factor = 100

    }

}

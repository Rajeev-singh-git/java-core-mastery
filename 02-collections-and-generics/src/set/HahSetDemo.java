package set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HahSetDemo {

    public static void main(String[]args) {
        HashSet hs = new HashSet();   // Hashset with default capacity of 16
        HashSet hs1 = new HashSet(100); /* Hashset with default capacity of 100 will be created
                                                  load factor of hashset is 75 %, when 75% capacity of
                                                  hashset is filled, capacity of hashset will become
                                                  double of current capacity */

        HashSet hs3 = new HashSet(100, .80f);  //load factor changed to 80 %

        ArrayList l = new ArrayList();
        HashSet hs4 = new HashSet(l);          // we will get equivalent hashset for arraylist

    }


}

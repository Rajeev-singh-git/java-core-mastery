package map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void main(String []args){

        NavigableMap<String, Integer> t = new TreeMap<>();
        t.put("ABC",123);
        t.put("DEF",456);
        t.put("HIJ",789);
        t.put("MNO",546);
        t.put("PQR",776);
        t.put("XYZ",775);
        t.put("JKL",987);
        t.put("STU",544);
        t.put("LMN",543);

        System.out.println(t);  // {ABC=123, DEF=456, HIJ=789, JKL=987, LMN=543, MNO=546, PQR=776, STU=544, XYZ=775}

        System.out.println(t.ceilingEntry("HIJ"));  // HIJ=789
        System.out.println(t.floorKey("PQR"));          // PQR
        System.out.println(t.higherKey("ABC"));         // DEF
        System.out.println(t.lowerKey("PQR"));          // MNO
        System.out.println(t.ceilingKey("XYZ"));        // XYZ
        System.out.println(t.descendingKeySet());       // [XYZ, STU, PQR, MNO, LMN, JKL, HIJ, DEF, ABC]
        System.out.println(t.headMap("JKL"));     // {ABC=123, DEF=456, HIJ=789}
        System.out.println(t.headMap("JKL",true));  // {ABC=123, DEF=456, HIJ=789, JKL=987}
        System.out.println(t.subMap("PQR","XYZ"));   // {PQR=776, STU=544}
     //   System.out.println("ABC",true,"PQR",false);
        System.out.println(t.tailMap("JKL"));   // {JKL=987, LMN=543, MNO=546, PQR=776, STU=544, XYZ=775}
        System.out.println(t.tailMap("PQR",false));  // {STU=544, XYZ=775}
        System.out.println(t.higherEntry("STU"));  // XYZ=775
        System.out.println(t.navigableKeySet());       // [ABC, DEF, HIJ, JKL, LMN, MNO, PQR, STU, XYZ]

    }


}

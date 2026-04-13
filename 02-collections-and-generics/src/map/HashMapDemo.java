package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String [] args){
        HashMap map = new HashMap();  // Capacity = 16, Load factor = 0.75
        Map m = new HashMap();
        HashMap mp = new HashMap(20); //Capacity = 20
        HashMap mpl = new HashMap(30,0.9f); // Capacity : 20, load factor =0.9
        HashMap newMap = new HashMap(m);

        HashMap<String, Integer> marks = new HashMap();
        marks.put("Science",90);
        marks.put("Math",80);
        marks.put("English", 95);
        marks.put("Ea",10);
        marks.put("Fa",10);

        System.out.println(marks.get("Ea"));  // 10

        System.out.println(marks.keySet());  // [English, Science, Fa, Math, Ea]

        System.out.println(marks);  // {English=95, Science=90, Math=80}

        System.out.println(marks.clone());  // {Science=90, English=95, Fa=10, Math=80, Ea=10}
        System.out.println(marks.containsKey("Science"));  // true

        System.out.println(marks.computeIfAbsent("Hello",k->1)); // 1
        System.out.println(marks);   // {English=95, Hello=1, Science=90, Fa=10, Math=80, Ea=10}

    }

}

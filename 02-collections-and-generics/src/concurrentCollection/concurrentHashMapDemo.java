package concurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMapDemo {

    public static void main (String [] args){
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<Integer,String>();
        map.put(0, "Basics");
        map.put(1, "Strong");
        map.put(0,"Tech");
        System.out.println(map);  // {0=Tech, 1=Strong}

        map.putIfAbsent(0,"Hello");
        System.out.println(map);   // {0=Tech, 1=Strong}

        map.remove(1,"Strong");
        System.out.println(map);  //  {0=Tech}

        map.replace(0,"Tech","TechConnect");
        System.out.println(map);  // {0=TechConnect}

        System.out.println( map.replace(0,"BasicsStrong"));  // TechConnect  It will return value, it is replacing

        map.replace(0,"BasicsStrong");
        System.out.println(map);  // {0=BasicsStrong}

        System.out.println( map.replace(3,"BasicsStrong"));  // null


    }
}

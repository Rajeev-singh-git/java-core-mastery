package map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[]args){
        HashMap m = new HashMap();
        Temp t = new Temp();
        m.put(t, "element");
        System.out.println(m);  // {temp=element}


        t=null;
        System.gc();
        try{
            Thread.sleep(3000);
            System.out.println(m);  // {temp=element}
        }catch (InterruptedException e){

        }

        WeakHashMap m1= new WeakHashMap();
        Temp t1 = new Temp();
        m.put(t1, "element");
        System.out.println(m1);       // {}


        t=null;
        System.gc();
        try{
            Thread.sleep(3000);
            System.out.println(m1);      // {}
        }catch (InterruptedException e){

        }





    }
}

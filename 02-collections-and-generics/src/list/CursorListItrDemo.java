package list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class CursorListItrDemo {

    public static void  main(String[]args){

        ArrayList<String> data = new ArrayList<>();

        data.add("Rajeev");
        data.add("Singh");
        data.add("Focus");
        data.add("on");
        data.add("Goal");

        System.out.println(data);

        ListIterator li = data.listIterator();
        while(li.hasNext())
        {
            String item = (String)li.next();

            if(item.equals("on"))
            {
                li.add("the");
            }
            if(item.equals("Singh"))
            {
                li.remove();
            }
            if(item.equals("Rajeev"))
            {
                li.set("Raj");
            }
        }

        System.out.println(data);

    }




}

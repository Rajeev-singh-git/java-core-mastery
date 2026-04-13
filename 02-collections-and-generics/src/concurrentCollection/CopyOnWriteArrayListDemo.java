package concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
 //   static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

     /*If we uncomment line no 8, Program will give exception :
     Exception in thread "main" java.lang.UnsupportedOperationException
	 at java.base/java.util.concurrent.CopyOnWriteArrayList$COWIterator.remove(CopyOnWriteArrayList.java:1124)
	 at concurrentCollection.CopyOnWriteArrayListDemo.main(CopyOnWriteArrayListDemo.java:20)
    */

    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args){
        list.add("John");
        list.add("Rohn");
        list.add("Harry");
        list.add("Potter");
        Iterator itr = list.iterator();

        while (itr.hasNext()){
            String name = (String) itr.next();
            if(name.equals("Harry")){
                itr.remove();
            }
        }
        System.out.println(list);

    }



}

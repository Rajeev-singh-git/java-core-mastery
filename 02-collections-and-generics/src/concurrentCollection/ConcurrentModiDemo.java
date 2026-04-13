package concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModiDemo extends Thread{

    private static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[]args){
        ConcurrentModiDemo tchild = new ConcurrentModiDemo();

        list.add("Puja");
        list.add("Rajeev");
        list.add("Abhishek");
        Iterator itr = list.iterator();
        tchild.start();

        while(itr.hasNext()) {
            String name = (String) itr.next();
            System.out.println("Main thread iterating -> " + name);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void run(){
        try {
            Thread.sleep(100);
        }catch(Exception e){
            e.printStackTrace();
        }
        list.add("Anurag");
    }

}

/* Output
Main thread iterating -> Puja
Main thread iterating -> Rajeev
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at concurrentCollection.ConcurrentModiDemo.main(ConcurrentModiDemo.java:20)

 */
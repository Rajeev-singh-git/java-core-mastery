package queue;

import com.sun.source.tree.Tree;

import java.util.*;

public class PriorityQueueDemo {

    public static void  main(String[] args){
        PriorityQueue pq = new PriorityQueue();  // def size = 11 , Natural Sorting order

        PriorityQueue pq1 = new PriorityQueue(20);

      //  PriorityQueue pq3 = new PriorityQueue(int initialCapacity, Comparator c);
        // Priority queue with customized sorting order and capacity

        List l = new ArrayList();
        PriorityQueue pq3 = new PriorityQueue(l);

        SortedSet s = new TreeSet();
        PriorityQueue pq4 = new PriorityQueue(l);

 }

}

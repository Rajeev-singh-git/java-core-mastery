package Lambda;

import java.util.*;

public class sortingListWithoutLambda {

    public static void main(String [] args){

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(2);
        list.add(1);
        list.add(30);
        list.add(60);

        System.out.println(list);     // [10, 2, 1, 30, 60]

        Collections.sort(list);

        System.out.println(list);     // [1, 2, 10, 30, 60]

        Collections.sort(list,new MyComaparator());
        System.out.println(list);    // [60, 30, 10, 2, 1]
    }

}

class MyComaparator implements Comparator<Integer>{

    @Override
    public int compare(Integer i1,Integer i2){
       if(i1>i2){
           return -1;
       }else if(i2>i1){
           return 1;
       }else{
           return 0;
       }
    }
}
package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortingListWithLambda {

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


        Collections.sort(list,(o1, o2) ->  { if(o1>o2){
            return -1;
        }else if(o2>o1){
            return 1;
        }else{
            return 0;
        }});

        System.out.println(list);    // [60, 30, 10, 2, 1]
    }

}



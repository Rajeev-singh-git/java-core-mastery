package list;

import java.util.Stack;

public class stackDemo {

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(true);
        s.push("Rajeev");
        s.push("Singh");
        System.out.println(s);    // [10, true, Rajeev, Singh]

        s.pop();
        System.out.println(s);    // [10, true, Rajeev]

        Object o = s.pop();
        System.out.println(o);    // Rajeev

        Object obj = s.peek();     // peek method returns top element of the stack
        System.out.println(obj);   // true
        System.out.println(s);     // [10, true]

        System.out.println(s.empty());     //false    // returns false if there is element in stack

        System.out.println(s.search(10));  // 2    // returns position of element from top
    }
}
